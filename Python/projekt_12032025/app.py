import pandas
import mariadb

#Connect to MariaDB and database Anwesenheitsverwaltung
try: 
    conn = mariadb.connect(
        user='root',
        password='root',
        host='localhost',
        port=3306,
        database='Anwesenheitsverwaltung'
    )
except mariadb.Error as e:
    print(f'Error connecting to MariaDB: {e}')
    exit(0)

#Creates cursor for the database
cur = conn.cursor()
#Ensures database is being used.
cur.execute("USE Anwesenheitsverwaltung;")

# Reads data from Excel file and converts the Timestamp from Datum into date format.
excel_data = pandas.read_excel('Anwesenheit.xlsx')
excel_data["Datum"] = pandas.to_datetime(excel_data["Datum"]).dt.date

#Transfer data from excel to MariaDB database
for row in excel_data.itertuples(index=False):
    student_ID = row[0]
    Datum = row[1]
    status = row[2]

    #Retrieves Tag_id from Table Tage and if it does not exist, it creates the entry first.
    cur.execute(f'SELECT tag_ID from Tage where Datum=?;', (Datum,))
    tag_ID = cur.fetchone()[0]
    if tag_ID is None:
        cur.execute(f'INSERT INTO Tage(Datum) VALUES (?);', (tag_ID,))
        cur.execute(f'SELECT tag_ID from Tage where Datum=?;', (tag_ID,))
        tag_ID = cur.fetchone()[0]

    #Try catch to ensure that there is no error if entry already exists
    try:
        cur.execute(f'INSERT INTO anwesenheit (Student_ID,Tag_ID,Status) VALUES (? , ? , ?)', (student_ID,tag_ID,status))
    except Exception as e:
        print(e)
        continue

conn.commit()
conn.close()