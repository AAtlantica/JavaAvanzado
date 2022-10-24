package org.example.clase3.Actividades;

import java.io.File;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Ejercicio 7
        tratarExcepciones3("archivo");

    }

    //TODO: Ejercicio 7, el tratamiento de excepcion debe ser diferente al del ejercicio 6
    public static void tratarExcepciones3(String archivoEmpleado) {
        File file = new File(archivoEmpleado);
        Scanner contents = new Scanner(file);
    }
}
