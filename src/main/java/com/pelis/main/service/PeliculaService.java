package com.pelis.main.service;

import com.pelis.main.model.Pelicula;
import java.util.Optional;
import java.util.List;

public interface PeliculaService {
    //El Optional ayuda a manejar mejor los valores que pueden o no estar, como control de nulls
    List<Pelicula> getPeliculas();
    Optional<Pelicula> getPeliculaById(Long id);
}
