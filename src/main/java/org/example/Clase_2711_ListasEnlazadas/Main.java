package org.example.Clase_2711_ListasEnlazadas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Listas lista = new Listas();

        //Agregando datos
        int op = 0;
        do{
            int valor = sc.nextInt();

            lista.agregarAlInicio(valor);
            lista.agregarAlFinal(valor);
            lista.mostrarLista();
            System.out.println();

            System.out.println("continuar? <0-Si // 1-No>");
            op = sc.nextInt();

        }while(op != 1);



    }
}
