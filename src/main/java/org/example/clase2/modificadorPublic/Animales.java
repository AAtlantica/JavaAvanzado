package org.example.clase2.modificadorPublic;

public class Animales {

    //Modificador de acceso: Public
    //clase: visible desde cualquier clase;
    //atributo: visible desde cualquier clase
    //metodo: visible desde cualquier clase

    //observaciones: independientemente del paquete en el que se encuentren o se desee utilizar.
   public String nombre;

   public void mostrarNombre(){
       System.out.println(this.nombre);
   }

    @Override
    public String toString() {
        return "Animales{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
