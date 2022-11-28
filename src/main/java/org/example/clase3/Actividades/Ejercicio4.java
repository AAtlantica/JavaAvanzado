package org.example.clase3.Actividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Ejercicio 4;
        int x = 0, y = 0;
        double m = 0, n = 0;
        String s;

        x = ejercicio4("Introduce un número entero: ");
        y = ejercicio4("Introduce otro número entero: ");

        System.out.print("Introduce un texto: ");
        s = sc.nextLine();

        //m = leerDouble("Introduce un número double: ");
        //n = leerDouble("Introduce otro número double: ");

        System.out.println("primer int introducido -> " + x);
        System.out.println("segundo int introducido -> " + y);
        System.out.println("primer double introducido -> " + m);
        System.out.println("segundo double introducido -> " + n);
        System.out.println("Texto introducido: " + s);

    }

    /*Tratamiento de excepciones para leer dos números de tipo int, un String y dos números de tipo double y mostrar los valores leídos por pantalla. */
    //Se realizará un método para leer un número int y otro para leer un double.
    //En estos métodos se realiza el control de excepciones en la lectura por teclado. */
    //TODO: Ejercicio 4 Ej:
    public static int ejercicio4(String s) {
        boolean repetir;
        int n = 0;
        do {
            repetir = false;
            try {
                System.out.print(s);
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido");
                repetir = true;
            } finally {
                sc.nextLine();
            }
        } while (repetir);
        return n;
    }
    //TODO: Ahora escribe el método para leer el double teniendo como referencia el método anterior

}
