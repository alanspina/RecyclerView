package com.example.reciclerview;



public class Personajes {
    private String nombre;
    private String origenSerie;
    private Integer imagen;

    public Personajes(String nombre, String origenSerie, Integer imagen) {
        this.nombre = nombre;
        this.origenSerie = origenSerie;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigenSerie() {
        return origenSerie;
    }

    public void setOrigenSerie(String origenSerie) {
        this.origenSerie = origenSerie;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }
}
