package org.example.clase3.Actividades;

import java.io.FileInputStream;

public class Ejercicio9 {
    public static void main(String[] args) {
        //Ejercicio 9
        ejercicio9();
    }
    //TODO: Ejercicio 9; Resolverlo gestionando la excepcion en el metodo que lo contiene.
    public static void ejercicio9(){
        FileInputStream archivo = new FileInputStream("archivo");
        String x = (byte) archivo.read();
    }
}
