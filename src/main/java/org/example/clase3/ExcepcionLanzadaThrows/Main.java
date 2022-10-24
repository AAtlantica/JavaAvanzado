package org.example.clase3.ExcepcionLanzadaThrows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer valor = 1;


        System.out.println(valor + 1);

        try(Scanner sc = new Scanner(System.in)) {
            error();
        }catch (Exception e){
            System.out.println("El main dice: Lo agarre yo");
        }finally {
            /*El bloque finally siempre se imprime, salvo caso que la excepción que se arroje no se encuentre gestionada
            y la ejecución del programa se interrumpa abruptamente*/

            System.out.println("Siempre me imprimo");
        }
        System.out.println("Hola mundo");
    }
    public static void error() throws ArithmeticException{
        /*El método comprueba, si la condición es verdadera lanza la excepción para que lo trate el método que lo invoco
        si es falsa no la lanza, como esta excepción es no chequeada, no es necesario declararla en firma del método,
        en caso de que sea chequeada si se debe declarar*/

        Integer valor = null;
        if(valor == null){
            throw new ArithmeticException();
        }
        System.out.println("Estoy bien");
    }
}
