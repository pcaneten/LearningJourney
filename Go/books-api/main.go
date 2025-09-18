package main

import (
	"database/sql"
	"fmt"
	"log"
	"net/http"
	"os"

	_ "github.com/lib/pq"
	"github.com/gorilla/mux"
	"github.com/joho/godotenv"
	"books-api/controllers"
)

var db *sql.DB
func main(){

	// Loading the env variables
	err := godotenv.Load()
	if err != nil {
		log.Fatal("Could not connect to the database:", err)
	}

	// Connect to DB
	db, err = connectDB()
	if err != nil {
		log.Fatal("Could not connect to the database;", err)
	}
	defer db.Close()

	controllers.Init(db) // initialize DB for controllers

	// Router
	r := mux.NewRouter()
	r.HandleFunc("/books", controllers.GetBooks).Methods("GET")
	r.HandleFunc("/books/{id}", controllers.GetBook).Methods("GET")
	r.HandleFunc("/books", controllers.CreateBook).Methods("POST")
	r.HandleFunc("/books/{id}", controllers.UpdateBook).Methods("PUT")
	r.HandleFunc("/books/{id}", controllers.DeleteBook).Methods("DELETE")

	fmt.Println("Server running on port 8000")
	log.Fatal(http.ListenAndServe(":8000", r))

}

func connectDB() (*sql.DB, error) {
	psqlInfo := fmt.Sprintf(
		"host=%s port=%s user=%s password=%s dbname=%s sslmode=disable",
		os.Getenv("DB_HOST"),
		os.Getenv("DB_PORT"),
		os.Getenv("DB_USER"),
		os.Getenv("DB_PASSWORD"),
		os.Getenv("DB_NAME"),
	)

	db, err := sql.Open("postgres", psqlInfo)

	if err != nil {
		return nil, err
	}

	err = db.Ping()
	if err != nil {
		return nil, err
	}

	fmt.Println("Connected to database succesfully")

	createTable := `
	CREATE TABLE IF NOT EXISTS books(
		id SERIAL PRIMARY KEY,
		title TEXT NOT NULL,
		author TEXT NOT NULL,
		year INT NOT NULL
		);`
	
	_, err = db.Exec(createTable)
	if err != nil {
		return nil, err
	}	
	return sql.Open("postgres", psqlInfo)
}