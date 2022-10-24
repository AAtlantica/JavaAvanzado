package org.example.clase3.ExcepcionTryCatch;

public class Main {

    public static void main(String[] args) throws Exception {
            //Las excepciones que puedan ocurrir en la división de 3 con 0, son gestionadas en el mismo metodo que las contiene
            try {
                System.out.println(3/0);;
            }catch (Exception e){
                System.out.println("No se puede divir por cero");
            }finally {
                System.out.println("Siempre me imprimo");
            }
        System.out.println("Hola mundo");
    }
}