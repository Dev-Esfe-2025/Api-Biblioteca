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

import com.dev.biblioteca.Modelos.Autor;
import com.dev.biblioteca.Servicios.Implementaciones.AutorService;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @Autowired
    private  AutorService autorService;


    @GetMapping
    public List<Autor> listar() {
         return autorService.listarAutores();
     }

    @PostMapping
    public Autor crear(@RequestBody Autor autor) {
         return autorService.guardarAutor(autor);
     }

    @GetMapping("/{id}")
    public Autor obtener(@PathVariable Integer id) { 
        return autorService.obtenerAutorPorId(id); 
    }

    @PutMapping("/{id}")
    public Autor actualizar(@PathVariable Integer id, @RequestBody Autor autor) {
        return autorService.actualizarAutor(id, autor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
         autorService.eliminarAutor(id);
     }
}