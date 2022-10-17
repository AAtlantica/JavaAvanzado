package org.example.clase2.modificadorPrivate;

public class Persona {

    //Modificador de Acceso: Private
    //En atributos: Solo se puede usar dentro de la misma clase
    private String nombre;
    private String apellido;

    // para acceder a los atributos de tipo private usamos los setters
    public void setNombre(String nombre){
        this.nombre = nombre;

        //Aca llamamos al metodo de tipo privado
        mostrarNombre();
    }

    //En metodos: Solo se pueden usar dentro de la misma clase
    private void mostrarNombre(){
        System.out.println(this.nombre);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
