package com.aplication.tarea4.tablas;

import java.io.Serializable;

public class Empleados implements Serializable
{
    private Integer id;
    private String nombres;
    private String descripcion;
    private String pathImage;
    private byte[] image;


    public Empleados()
    {
        // Constructor Vacio
    }

    public Empleados(Integer id, String nombres, String descripcion, String pathImage, byte[] image) {
        this.id = id;
        this.nombres = nombres;
        this.descripcion = descripcion;
        this.pathImage = pathImage;
        this.image = image;

    }

//Get
    public Integer getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getDescripcion() {
        return descripcion;
    }

//Set
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setDescripcion(String apellidos) {
        this.descripcion = apellidos;
    }

//Get Set Foto
    public String getPathImage() {
    return pathImage;
}

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
