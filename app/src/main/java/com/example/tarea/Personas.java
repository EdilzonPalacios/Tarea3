package com.example.tarea;

public class Personas {
    public Integer id;
    public String nombres;
    public String descripcion;

    public Personas()
    {
        //Todo
    }
    public Personas(Integer id, String nombres, String apellidos) {
        this.id = id;
        this.nombres = nombres;
        this.descripcion = apellidos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
