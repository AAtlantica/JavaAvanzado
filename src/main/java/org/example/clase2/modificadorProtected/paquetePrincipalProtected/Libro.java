package org.example.clase2.modificadorProtected.paquetePrincipalProtected;

public class Libro {

    //Modificador de acceso: Protected
    //A tener en cuenta:
    //1.Se emplea en la herencia

    //En atibutos:
    // 1. Podemos acceder si esta dentro del mismo paquete
    // 2. Podemos acceder desde la clase hija
    protected static String nombre;
    protected String autor;

    //En metodos o funciones:
    // 1. Podemos acceder si esta dentro del mismo paquete
    // 2. Podemos acceder desde la clase hija

    protected void mostrarAutor(){
        System.out.println(this.autor);
    }




    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
