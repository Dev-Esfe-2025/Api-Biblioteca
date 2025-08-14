package com.dev.biblioteca.Servicios.Implementaciones;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.biblioteca.Modelos.Libro;
import com.dev.biblioteca.Repositorios.LibroRepositorio;
import com.dev.biblioteca.Servicios.Interfaces.ILibroService;

@Service
public class LibroService implements ILibroService {

    @Autowired
    private  LibroRepositorio libroRepositorio;

  
    @Override
    public List<Libro> listarLibros() { return libroRepositorio.findAll(); }

    @Override
    public Libro guardarLibro(Libro libro) { return libroRepositorio.save(libro); }

    @Override
    public Libro obtenerLibroPorId(Integer id) {
        return libroRepositorio.findById(id).orElse(null);
    }

    @Override
    public Libro actualizarLibro(Integer id, Libro libro) {
        Libro existente = libroRepositorio.findById(id).orElse(null);
        if (existente != null) {
            existente.setTitulo(libro.getTitulo());
            existente.setAño(libro.getAño());
            existente.setAutor(libro.getAutor());
            return libroRepositorio.save(existente);
        }
        return null;
    }

    @Override
    public void eliminarLibro(Integer id) { libroRepositorio.deleteById(id); }

    @Override
    public List<Libro> listarLibrosPorAutor(Integer autorId) {
        return libroRepositorio.findByAutorId(autorId);
    }
}