SET CHARACTER SET utf8mb4;
DROP DATABASE IF EXISTS Anwesenheitsverwaltung;
CREATE DATABASE Anwesenheitsverwaltung CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE Anwesenheitsverwaltung;

CREATE TABLE Student (
	Student_ID INT NOT NULL,
	Name VARCHAR(255) NOT NULL,
	PRIMARY KEY (Student_ID)
);

CREATE TABLE Tage (
	Tag_ID INT NOT NULL AUTO_INCREMENT,
	Datum DATE NOT NULL,
	PRIMARY KEY (Tag_ID),
	UNIQUE KEY (Datum)
);

CREATE TABLE Anwesenheit (
	Student_ID INT,
	Tag_ID INT,
	Status ENUM('Anwesend', 'Präsenz', 'Online', 'Verspätet', 'Entschuldigt', 'Unentschuldigt') NOT NULL,
	PRIMARY KEY (Student_ID, Tag_ID),
	FOREIGN KEY (Student_ID) REFERENCES Student(Student_ID) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (Tag_ID) REFERENCES Tage(Tag_ID) ON DELETE CASCADE ON UPDATE CASCADE
);