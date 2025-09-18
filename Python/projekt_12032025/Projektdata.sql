SET CHARACTER SET utf8mb4;
USE Anwesenheitsverwaltung,

INSERT INTO Student (Student_ID, Name) VALUES 
	(1001, 'Max Mustermann'), 
	(1002, 'Lisa Schmidt'), 
	(1003, 'Silke Gerdes'), 
	(1004, 'Lars Wagner'), 
	(1005, 'Jonas Becker'); 

INSERT INTO Tage (Datum) VALUES 
	('2025-03-01'), 
	('2025-03-02'),
	('2025-03-03'),
	('2025-03-04'),
	('2025-03-05');

INSERT INTO Anwesenheit (Student_ID, Tag_ID, Status) VALUES 
	(1001, 1, 'Anwesend'),
	(1002, 1, 'Anwesend'),
	(1003, 2, 'Online'),
	(1004, 3, 'Entschuldigt'),
	(1005, 4, 'Online');