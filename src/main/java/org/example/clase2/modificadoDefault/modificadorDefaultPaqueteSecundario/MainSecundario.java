package org.example.clase2.modificadoDefault.modificadorDefaultPaqueteSecundario;

import org.example.clase2.modificadoDefault.modificadorDefaultPaquetePrincipal.Vehiculo;

public class MainSecundario {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        //vehiculo.nombre = "Renault"; --> No se puede acceder porque es de tipo default y esta en otro paquete.

        //vehiculo.mostrarMarca(); --> No se puede acceder porque es de tipo default y esta en otro paquete.
    }
}
