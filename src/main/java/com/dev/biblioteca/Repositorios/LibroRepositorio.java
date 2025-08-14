package com.dev.biblioteca.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.biblioteca.Modelos.Libro;

public interface LibroRepositorio extends JpaRepository<Libro, Integer> {
    List<Libro> findByAutorId(Integer autorId);

}