package com.pelis.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "anio")
    private int anio;
    @Column(name = "director")
    private String director;
    @Column(name = "genero")
    private String genero;
    @Column(name = "sinopsis")
    private String sinopsis;

    //por efectos, nos fumamos el constructor
    
    //Getter
    public Long getId(){
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getAnio(){
        return anio;
    }

    public String getDirector(){
        return director;
    }

    public String getGenero(){
        return genero;
    }

    public String getSinopsis(){
        return sinopsis;
    }

    //Setter
    public void setId(Long id){
        this.id = id;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }
    
}
