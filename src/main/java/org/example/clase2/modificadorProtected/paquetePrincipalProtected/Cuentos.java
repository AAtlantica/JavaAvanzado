package org.example.clase2.modificadorProtected.paquetePrincipalProtected;

public class Cuentos extends Libro{

    protected String tipo;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cuentos{" + super.toString() +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
