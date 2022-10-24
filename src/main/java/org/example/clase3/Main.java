package org.example.clase3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String path = "/home/francisco/Documentos/7-Clases/3-Clases Angel/JavaAvanzado/src/main/java/org/example/clase3/alumnos.txt";
       static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       /*
        Alumnos alumnos = new Alumnos();
        File archivo = alumnos.get_file(path);
        alumnos.reader_file(archivo);
        */

        //Si ejecutamos vemos la excepcion no comprobada
/*
      Integer[] valor = new Integer[2];
      valor[0] = 1;
      valor[1] = 2;
      valor[2] = 3;
      System.out.println(valor);
*/

        /*System.out.println(3/0);*/

        //System.out.println("Por favor ingrese una valor distinto de vacio");

        Integer valor = 1;


            System.out.println(valor + 1);

            try(Scanner sc = new Scanner(System.in)) {
                error();
            }catch (Exception e){
                System.out.println("El main dice: Lo agarre yo");
            }finally {
                System.out.println("Siempre me imprimo");
            }
        System.out.println("Hola mundo");
    }
    public static void error() throws ArithmeticException{
        Integer valor = 1;

           if(valor == null){
               throw new ArithmeticException();
           }
        System.out.println("Estoy bien");
    }
}
