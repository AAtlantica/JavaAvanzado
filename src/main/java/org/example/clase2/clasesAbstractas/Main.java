package org.example.clase2.clasesAbstractas;

public class Main {
    public static void main(String[] args) {

        Aves colibri = new Colibri();
        colibri.setNombre("Colibri");
        colibri.setTipo("Ave");
        System.out.println(colibri);

        //1 la expresion lamba se gasta
        //2 la palabra protected en la hija en otro paquete
    }
}
