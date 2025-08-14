package com.dev.biblioteca.Servicios.Implementaciones;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.biblioteca.Modelos.Autor;
import com.dev.biblioteca.Repositorios.AutorRepositorio;
import com.dev.biblioteca.Servicios.Interfaces.IAutorService;

@Service
public class AutorService implements IAutorService {

    @Autowired
    private  AutorRepositorio autorRepositorio;

    @Override
    public List<Autor> listarAutores() { return autorRepositorio.findAll(); }

    @Override
    public Autor guardarAutor(Autor autor) { return autorRepositorio.save(autor); }

    @Override
    public Autor obtenerAutorPorId(Integer id) {
        return autorRepositorio.findById(id).orElse(null);
    }

    @Override
    public Autor actualizarAutor(Integer id, Autor autor) {
        Autor existente = autorRepositorio.findById(id).orElse(null);
        if (existente != null) {
            existente.setNombre(autor.getNombre());
            existente.setNacionalidad(autor.getNacionalidad());
            return autorRepositorio.save(existente);
        }
        return null;
    }

    @Override
    public void eliminarAutor(Integer id) { autorRepositorio.deleteById(id); }
}