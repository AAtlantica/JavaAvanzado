package org.example.clase4.I_list.c_arrayList;

import java.util.List;
import java.util.Random;

public class ArrayList<I extends Number> {

    public static void main(String[] args) {

        Random random = new Random();
        int valor = random.nextInt(24) +1;

        List<Integer> numeros = new java.util.ArrayList<>();
        //Primer metodo add();
        for(int i = 0; i < valor ; i++){
            numeros.add(i);
        }

        //La imprimimos
        System.out.println("Imprimiendo lista");
        System.out.println(numeros + "\n");

        //Obtener valores por indice... get(indice)
        System.out.println("Usando get(int indice) para obtener el elemento de un indice especifico");
        System.out.println("Elemento ubicado en el indice 0: " + numeros.get(0) + "\n");

        //Buscamos la posición en que se encuentra el elemento .. indexOf(E e)
        System.out.println("Usando indexOf(E e) para obtener la posición en la que se encuentra el elemento");
        System.out.println("Elemento ubicado en la posición 2 " + numeros.indexOf(2) + "\n");

        /* En las listas pueden existir elementos duplicados, por ejemplo el elemento 5, si buscasemos dicho elemento
         * en ese caso la siguiente instrucción definira la ultima ubicación del elemento en la lista.
         */
        //Agregamos un valor mas a la lista lastIndexOf(E e)
        System.out.println("Usando lastIndexOf(E e) para obtener la ultima posición de un elemento");
        numeros.add(5);
        System.out.println("Nueva lista con el valor 5 duplicado " + numeros);
        System.out.println("Imprimimos la ultima posición del valor 5: " + numeros.lastIndexOf(5) + "\n");

        //Eliminando el elemento ubicado en la posición 0
        System.out.println("Usando remove(int indice) para borrar un elemento ubicado en una posición especifica");
        System.out.println("Lista antes de borrar la posición 0: " + numeros);
        System.out.println("Removiendo el elemento de la posición 0: " + numeros.remove(0));
        System.out.println("Lista con elemento en la posición 0 removido: " + numeros + "\n");

        //Agregan un elemento en una posición especifica
        System.out.println("Usando set(int indice, E e) para agregar un elemento en una posicion especifica");
        System.out.println("Lista antes de agregar el elemento en el indice 0: " + numeros);
        System.out.println("Elemento que se encontraba en la posición 0: " + numeros.set(0, 34));
        System.out.println("Lista despues de agregar el elemento en el indice 0: " + numeros +"\n");


        //Usando metodos o funciones que heredan de Collection
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("\t\t Usando metodos o funciones que heredan de Collection");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Eliminando la primera ocurrencia del elemento indicado usando remove(E e)");
        System.out.println("Lista antes de borrar el valor ubicado en la posición 5 en la colección: " + numeros);
        System.out.println("Removiendo el valor: " + numeros.remove(5));
        System.out.println("Lista luego de borrar el valor de la posición 5: " + numeros + "\n");


        System.out.println("Comprobando si existe el elemento en la lista usando contains(E e)");
        System.out.println("Existe el elemento  3 enla lista? " + numeros.contains(3) + "\n");

        System.out.println("Verificando el tamaño de la lista usando size()");
        System.out.println("Tamaño de la lista: " + numeros.size() +"\n");

        //Eliminando todos los elementos de la lista usando clear();
        System.out.println("Borrando...\n");
        //TODO: descomentar esto cuando llegamos a este punto --> numeros.clear();

        //Verificando si la lista esta vacia
        System.out.println("Verificando si la lista esta vacia usando isEmpty()");
        System.out.println("Lista vacia? " + numeros.isEmpty() + "\n");

        //Agregando otra lista en la lista
        //TODO:comentar la linea donde limpia la lista existente para ver cambios(linea 70)
        System.out.println("Agregando elementos de otra lista a la lista existente usando addAll(Collection<?> c)");
        //creando lista
        List<Integer> numero2 = new java.util.ArrayList<>();
        numero2.add(10);
        numero2.add(15);
        System.out.println("Antes de agregar los elementos de lista nueva: " + numeros);
        //agregando a la existente
        //TODO: comentar esto cuando llegamos a containsAll -->
        numeros.addAll(numero2);
        System.out.println("Lista ya existente actualizada: " + numeros +"\n");

        //Eliminando todos los elementos de la lista numero2, que estan en la lista numero independientes si los elementos de la lista 1 ya los contenia.
        System.out.println("Eliminando todos elementos de la lista numero2 que estan en lista numeros usando removeAll(Collection<?> c)");
        System.out.println("Antes de borrar los elementos de la lista numero2: " + numeros);
        //TODO: comentar esto cuando llegamos a containsAll -->  System.out.println("Removiendo? " + numeros.removeAll(numero2));
        System.out.println("Lista ya existente actualizada, sin los elementos de la lista numero2: " + numeros + "\n");

        //Verificando si la lista a agregar contiene los mismos elementos que la lista existentes
        System.out.println("Verificando si la lista existente ya posee los mismos elementos que la lista a agregar usando containsAll(Collection<?> c)");
        System.out.println("Tiene los elementos?" + numeros.containsAll(numero2) +"\n");

        //Borrando todos los elementos de la lista existente salvo los elementos de la lista agregada
        System.out.println("Eliminando todos los elementos de la lista existente, salvo los elementos de la lista agregada usando retainAll(Collection<?> c)");
        System.out.println("Lista antes de borrar los elementos de lista ya existente: " + numeros);
        System.out.println("Borrando los elementos de la lista existente..");numeros.retainAll(numero2);
        System.out.println("Lista con los elementos de la lista existente borrados, prevalenciendo los elemento de la lista agregada: " + numeros);


    }

}
