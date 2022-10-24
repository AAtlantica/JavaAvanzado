package org.example.clase3.Actividades;

import java.io.FileInputStream;

public class Ejercicio10 {
    public static void main(String[] args) {
        //Ejercicio 10
        ejercicio10();
    }

    //TODO: Ejercicio 10; Resolverlo de forma diferente a la anterior
    public static void ejercicio10(){
        FileInputStream archivo = new FileInputStream("archivo");
        String x = (byte) archivo.read();
    }
}
