package com.pelis.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pelis.main.model.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long>{

    
}
