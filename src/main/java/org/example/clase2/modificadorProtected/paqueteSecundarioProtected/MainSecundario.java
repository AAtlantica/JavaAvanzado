package org.example.clase2.modificadorProtected.paqueteSecundarioProtected;


import org.example.clase2.modificadorProtected.paquetePrincipalProtected.Libro;

public class MainSecundario extends Libro{

    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.nombre = "La odisea";
        //TODO: era porque no estaba como static en la clase padre
        //TODO: quitar el extendes para ver que no cumple si no hereda
        System.out.println(libro);

    }
}
