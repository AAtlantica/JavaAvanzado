package org.example.clase2.clasesAbstractas;

//Una clase de tipo abstract no se puede instanciar
//Objetivo: ser base para construir la jerarquia de herencia de clases y aplicar el polimorfismo
//Observacion: si la clase "normal" tiene un metodo de tipo abstracto, la clase debe declararse como abstracta

public abstract class Aves {

    //puede contener: atributos, constructor y metodos "NO ABSTRACTOS"
    private String nombre;
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    abstract void mostrarTipo();
    @Override
    public String toString() {
        return "Aves{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
