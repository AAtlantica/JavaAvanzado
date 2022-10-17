package org.example.clase1;

import java.util.Objects;

public class Persona {

    {
        System.out.println("Soy bloque de codigo estatico");
    }

    private String nombre;
    private String apellido;
    private int edad;

    private Enum rol;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Enum getRol() {
        return rol;
    }

    public void setRol(Enum rol) {
        this.rol = rol;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\n"
                +"Apellido: " + this.apellido +"\n"
                +"Edad: " + this.edad + "\n"
        +"Rol: " + this.rol;
    }


}
