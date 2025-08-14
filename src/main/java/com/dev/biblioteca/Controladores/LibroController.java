package com.dev.biblioteca.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.biblioteca.Modelos.Libro;
import com.dev.biblioteca.Servicios.Implementaciones.LibroService;
@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private  LibroService libroService;


    @GetMapping
    public List<Libro> listar() {
         return libroService.listarLibros(); 
    }

    @PostMapping
    public Libro crear(@RequestBody Libro libro) { 
        return libroService.guardarLibro(libro);
    }

    @GetMapping("/{id}")
    public Libro obtener(@PathVariable Integer id) { 
        return libroService.obtenerLibroPorId(id);
     }

    @PutMapping("/{id}")
    public Libro actualizar(@PathVariable Integer id, @RequestBody Libro libro) {
        return libroService.actualizarLibro(id, libro);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) { 
        libroService.eliminarLibro(id);
     }

    @GetMapping("/autor/{autorId}")
    public List<Libro> librosPorAutor(@PathVariable Integer autorId) {
        return libroService.listarLibrosPorAutor(autorId);
    }
}