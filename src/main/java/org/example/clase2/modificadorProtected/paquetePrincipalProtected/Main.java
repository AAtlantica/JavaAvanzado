package org.example.clase2.modificadorProtected.paquetePrincipalProtected;

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro();
        Libro.nombre = "El Alquimista";
        libro.autor = "Paulo Cohelo";

        libro.mostrarAutor();

        System.out.println(libro);

        Cuentos cuento = new Cuentos();
        cuento.tipo = "Comedia";
        Libro.nombre = "Don Quijote";
        cuento.autor = "Nose";

        cuento.mostrarAutor();

        System.out.println(cuento);

    }
}
