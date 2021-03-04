package com.gm.mundopc;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_Computadoras = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora[MAX_Computadoras];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.MAX_Computadoras) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Has superado el limite:" + Orden.MAX_Computadoras);
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden #: " + this.idOrden);
        System.out.println("Computadoras  de la Orden #: " + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }

}
