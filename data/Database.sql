CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE autor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    nacionalidad VARCHAR(50)
);

CREATE TABLE libro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    año INT,
    autor_id INT,
    FOREIGN KEY (autor_id) REFERENCES autor(id)
);
