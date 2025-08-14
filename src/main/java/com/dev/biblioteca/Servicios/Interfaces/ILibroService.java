package com.dev.biblioteca.Servicios.Interfaces;

import java.util.*;

import com.dev.biblioteca.Modelos.Libro;

public interface    ILibroService {
    List<Libro> listarLibros();
    Libro guardarLibro(Libro libro);
    Libro obtenerLibroPorId(Integer id);
    Libro actualizarLibro(Integer id, Libro libro);
    void eliminarLibro(Integer id);
    List<Libro> listarLibrosPorAutor(Integer autorId);
}
