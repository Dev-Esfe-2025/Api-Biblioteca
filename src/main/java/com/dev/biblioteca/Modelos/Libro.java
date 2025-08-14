package com.dev.biblioteca.Modelos;

import jakarta.persistence.*;

@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;
    private Integer año;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    // Constructores
    public Libro() {}
    public Libro(String titulo, Integer año, Autor autor) {
        this.titulo = titulo;
        this.año = año;
        this.autor = autor;
    }

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Integer getAño() { return año; }
    public void setAño(Integer año) { this.año = año; }

    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) { this.autor = autor; }
}
