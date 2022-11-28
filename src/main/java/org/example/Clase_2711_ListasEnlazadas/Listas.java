package org.example.Clase_2711_ListasEnlazadas;

public class Listas {
    protected  Nodo inicio, fin; //punteros para saber donde esta el inicio y el fin

    public Listas(){
        inicio = null; //cuando pasamos el 5, aca esta la direcion de memoria del 4
        fin = null;
    }
                                        //3//4//5
    public void agregarAlInicio(int elemento){
        //Crear al nodo
        inicio = new Nodo(elemento, inicio);
        if(fin == null){
            fin = inicio;
        }
    }

    public void mostrarLista(){
        Nodo recorrer = inicio;
        System.out.println();
        while (recorrer!=null){
            System.out.print(recorrer.dato +"-->");
            recorrer = recorrer.siguiente;
        }
    }

    //Agregar al final
    //1.Verificar que la lista esta vacia
    public boolean estaVacia(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }

    public void agregarAlFinal(int dato){
        if(!estaVacia()){
            fin.siguiente = new Nodo(dato);
            fin = fin.siguiente;
        }else{
            inicio = fin = new Nodo(dato);
        }
    }


}
