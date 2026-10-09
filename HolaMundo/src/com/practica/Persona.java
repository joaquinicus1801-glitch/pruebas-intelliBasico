package com.practica;

public class Persona {
    public String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void saludar(){
        System.out.println("hola soy "+nombre);
    }
}
