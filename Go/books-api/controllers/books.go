package controllers

import (
	"database/sql"
	"encoding/json"
	"fmt"
	"net/http"
	"strconv"
	"strings"
	"time"

	"github.com/gorilla/mux"
)

type Book struct {
	ID     int    `json:"id"`
	Title  string `json:"title"`
	Author string `json:"author"`
	Year   int    `json:"year"`
}

var DB *sql.DB

func Init(db *sql.DB) {
	DB = db
}

func GetBooks(w http.ResponseWriter, r *http.Request) {

	//default values
	page := 1
	limit := 10
	sort := "id"
	order := "asc"
	filters := []string{}
	args := []interface{}{}
	argID := 1

	//Parsing query parameters
	q := r.URL.Query()
	
	if p := q.Get("page"); p != "" {
		if val, err := strconv.Atoi(p); err == nil && val > 0 {
			page = val
		}
	}

	if s := q.Get("sort"); s != "" {
		allowedSorts := map[string]bool{"id": true, "title": true, "author": true, "year": true}
		if allowedSorts[s] {
			sort = s
		}
	}

	if o := q.Get("order"); o != "" {
		if strings.ToLower(o) == "desc" {
			order = "desc"
		}
	}

	if author := q.Get("author"); author != "" {
		filters = append(filters, fmt.Sprintf("author ILIKE $%d", argID))
		args = append(args, "%"+author+"%")
		argID++
	}

	if year := q.Get("year"); year != ""{
		if val, err := strconv.Atoi(year); err == nil {
			filters = append(filters, fmt.Sprintf("year = $%d", argID))
			args = append(args, val)
			argID ++
		}
	}

	// Building the query for PostgreSQL
	query := "SELECT id, title, author, year FROM books"
	if len(filters) > 0 {
		query += " WHERE " + strings.Join(filters, " AND ")
	}
	query += fmt.Sprintf(" ORDER BY %s %s", sort, order)
	query += fmt.Sprintf(" LIMIT $%d OFFSET $%d", argID, argID+1)
	args = append(args, limit, (page-1)*limit)


	rows, err := DB.Query(query, args...)
	if err != nil {
		http.Error(w, "Failed to query database", http.StatusInternalServerError)
		return
	}
	defer rows.Close()

	var books []Book

	for rows.Next() {
		var b Book
		err := rows.Scan(&b.ID, &b.Title, &b.Author, &b.Year)
		if err != nil {
			http.Error(w, "Failed to read Data", http.StatusInternalServerError)
			return
		}
		books = append(books, b)
	}

	w.Header().Set("Content-Type", "application/json")
	json.NewEncoder(w).Encode(books)
}

func GetBook(w http.ResponseWriter, r *http.Request) {
	vars := mux.Vars(r)
	id := vars["id"]

	var b Book
	err := DB.QueryRow("SELECT id, title, author, year FROM books WHERE id = $1", id).Scan(&b.ID, &b.Title, &b.Author, &b.Year)

	if err != nil {
		if err == sql.ErrNoRows {
			http.Error(w, "Book not found", http.StatusNotFound)
			return
		}
		http.Error(w, "Failed to query Database", http.StatusInternalServerError)
		return
	}
	// Send JSON response
	w.Header().Set("Content-Type", "application/json")
	json.NewEncoder(w).Encode(b)

}

func CreateBook(w http.ResponseWriter, r *http.Request) {
	var b Book
	err := json.NewDecoder(r.Body).Decode(&b)
	if err != nil {
		http.Error(w, "Invalid request payload", http.StatusBadRequest)
		return
	}

	// Validation
	if strings.TrimSpace(b.Title) == "" || strings.TrimSpace(b.Author) == "" {
		http.Error(w, "Title and Author cannot be empty", http.StatusBadRequest)
		return
	}

	if b.Year < -1000 || b.Year > time.Now().Year() {
		http.Error(w, "Year is out of valid range", http.StatusBadRequest)
		return
	}

	query := "INSERT INTO books (title, author, year) VALUES ($1, $2, $3) RETURNING id"
	err = DB.QueryRow(query, b.Title, b.Author, b.Year).Scan(&b.ID)
	if err != nil {
		http.Error(w, "Failed to insert book", http.StatusInternalServerError)
		return
	}

	w.Header().Set("Content-Type", "application/json")
	w.WriteHeader(http.StatusCreated)
	json.NewEncoder(w).Encode(b)
}

func UpdateBook(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	id, err := strconv.Atoi(params["id"]) 
	if err != nil {
		http.Error(w, "Invalid book ID", http.StatusBadRequest)
		return
	}

	var b Book
	err = json.NewDecoder(r.Body).Decode(&b)
	if err != nil {
		http.Error(w, "Invalid request payload", http.StatusBadRequest)
		return
	}

	// Validation
	if strings.TrimSpace(b.Title) == "" || strings.TrimSpace(b.Author) == ""{
		http.Error(w, "Title and Author cannot be empty", http.StatusBadRequest)
	}

	if b.Year < -1000 || b.Year > time.Now().Year() {
		http.Error(w, "Year is out of valid range", http.StatusBadRequest)
		return
	}

	query := "UPDATE books SET title=$1, author=$2, year=$3 WHERE id=$4"
	_, err = DB.Exec(query, b.Title, b.Author, b.Year, id)
	if err != nil {
		http.Error(w, "Failed to update book", http.StatusInternalServerError)
		return
	}
	
	w.WriteHeader(http.StatusOK)
	w.Write([]byte("Book updated succesfully"))
}

func DeleteBook(w http.ResponseWriter, r *http.Request) {
	vars := mux.Vars(r)
	id := vars["id"]

	result, err := DB.Exec("DELETE FROM books WHERE id=$1", id)
	if err != nil {
		http.Error(w, "Failed to delete books", http.StatusInternalServerError)
		return
	}

	rowsAffected, _ := result.RowsAffected()
	if rowsAffected == 0 {
		http.Error(w, "Book not found", http.StatusNotFound)
		return
	}

	w.WriteHeader(http.StatusOK)
	w.Write([]byte("Book deleted successfully"))
}
