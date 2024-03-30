package com.pelis.main.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import com.pelis.main.model.Pelicula;
import com.pelis.main.service.PeliculaService;



@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
    @Autowired
    private PeliculaService peliculaService;

    @GetMapping
    public List<Pelicula> getPeliculas() {
        return peliculaService.getPeliculas();
    }
    
    @GetMapping("/{id}")
    public Optional<Pelicula> getPeliculaById(@PathVariable Long id) {
        return peliculaService.getPeliculaById(id);
    }
    
    
}
