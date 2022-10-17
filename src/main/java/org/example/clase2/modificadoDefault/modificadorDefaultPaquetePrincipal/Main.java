package org.example.clase2.modificadoDefault.modificadorDefaultPaquetePrincipal;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.nombre = "Ford";
        vehiculo.marca = "Ranger";

        //System.out.println(vehiculo);

        vehiculo.mostrarMarca();

    }
}
