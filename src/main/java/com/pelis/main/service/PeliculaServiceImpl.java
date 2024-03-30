package com.pelis.main.service;

import com.pelis.main.model.Pelicula;
import com.pelis.main.repository.PeliculaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaServiceImpl implements PeliculaService{
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getPeliculas(){
        return peliculaRepository.findAll();
    }
    
    @SuppressWarnings("null")
    @Override
    public Optional<Pelicula> getPeliculaById(Long id){
        return peliculaRepository.findById(id);
    }
}
