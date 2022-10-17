package org.example.clase2.modificadoDefault.modificadorDefaultPaquetePrincipal;

public class Vehiculo {

    //Modificador de Acceso: Default

    //En atributos: Solo puede ser usado por las clases dentro del mismo paquete
    String nombre;
    String marca;

    //En Metodos o Funciones: Solo puede ser usado por las clases dentro del mismo paquete
    void mostrarMarca (){
        System.out.println(this.marca);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
