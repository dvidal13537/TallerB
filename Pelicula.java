package com.company;

public class Pelicula {

    public String titulo;
    public int duracion;
    public String director;

    public Pelicula (String titulo, int duracion, String director){

        this.titulo = "Avatar";
        this.duracion = 120;
        this.director = "James Cameron";
    }

    public int getDuracion() {
        return duracion;
    }

    public String getDirector() {
        return director;
    }
}
