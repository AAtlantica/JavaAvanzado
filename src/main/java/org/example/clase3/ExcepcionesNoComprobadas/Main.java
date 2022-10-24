package org.example.clase3.ExcepcionesNoComprobadas;

public class Main {
    public static void main(String[] args) {
     //Si ejecutamos vemos una de las excepciones no comprobada

      Integer[] valor = new Integer[2];
      valor[0] = 1;
      valor[1] = 2;
      valor[2] = 3;
      System.out.println(valor);

      //Otro Ejemplo
      System.out.println(3/0);

    }
}
