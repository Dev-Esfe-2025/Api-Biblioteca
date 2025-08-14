package com.dev.biblioteca.Servicios.Interfaces;

import java.util.*;

import com.dev.biblioteca.Modelos.Autor;

public interface IAutorService {
    List<Autor> listarAutores();
    Autor guardarAutor(Autor autor);
    Autor obtenerAutorPorId(Integer id);
    Autor actualizarAutor(Integer id, Autor autor);
    void eliminarAutor(Integer id);
}