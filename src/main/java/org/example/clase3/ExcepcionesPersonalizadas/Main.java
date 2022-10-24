package org.example.clase3.ExcepcionesPersonalizadas;

public class Main {
    public static void main(String[] args) {

        //Ejemplo de lanzamiento de excepción personalizada
        int valor1 = 3;
        int valor2 = 0;
        if (valor2 == 0){
            throw new ExceptionPersonalizada("No se puede dividir por cero");
        }
        System.out.println(valor1 / valor2);
    }
}
