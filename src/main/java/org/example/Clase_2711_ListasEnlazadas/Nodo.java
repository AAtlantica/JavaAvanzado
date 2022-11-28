package org.example.Clase_2711_ListasEnlazadas;

public class Nodo {
    public int dato;
    public Nodo siguiente;

    //Constructor para insertar un nodo al final
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
    }

    //Constructor para insertar un nodo al inicio
    public Nodo(int dato, Nodo siguiente){
        this.dato = dato;
        this.siguiente= siguiente;
    }
}
