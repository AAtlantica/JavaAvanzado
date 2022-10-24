package org.example.clase3.Actividades;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Ejercicio 1
        ejercicio1();
    }
    /*
     *Determina el tipo de excepción de los siguientes ejercicios y gestiónalos de la forma que consideres correcta
     * */

    /*Tratamiento de excepciones para la lectura por teclado de cuatro números enteros.*/
    // TODO:Ejercicio 1:
    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0, z = 0, k = 0;
        boolean repetir;
        do {
            repetir = false;
            System.out.print("Introduce primer número entero: ");
            x = sc.nextInt();

            System.out.print("Introduce segundo número entero: ");
            y = sc.nextInt();

            System.out.print("Introduce tercer número entero: ");
            z = sc.nextInt();

            System.out.print("Introduce cuarto número entero: ");
            k = sc.nextInt();

        } while (repetir);
        System.out.println("int introducido -> " + x);
        System.out.println("int introducido -> " + y);
        System.out.println("int introducido -> " + z);
        System.out.println("int introducido -> " + k);
    }

}
