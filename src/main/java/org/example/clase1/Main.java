package org.example.clase1;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Angel");
        p1.setApellido("AngelApellido");
        p1.setEdad(30);
        p1.setRol(Roles.USER);

        Persona p2 = new Persona();
        p2.setNombre("Gabriel");
        p2.setApellido("GabrielApellido");
        p2.setEdad(30);
        p2.setRol(Roles.ADMIN);

        Persona p3 = new Persona();
        p3.setNombre("Lucia");
        p3.setApellido("LuciaApellido");
        p3.setEdad(30);
        p3.setRol(Roles.USER);

        Persona p4 = new Persona();
        p4.setNombre("Andre");
        p4.setApellido("AndresApellido");
        p4.setEdad(30);
        p4.setRol(Roles.ADMIN);

        mostrarDatos(p1,p2,p3,p4);
    }


    public static void mostrarDatos(Persona ...persona){
        //parte1: definis el tipo de dato de la lista a recorrer
        //parte2: definis el nombre de la variable
        //parte3: va el nombre de la lista
        for(Persona datos : persona){
            System.out.println(datos);
        }
    }

}