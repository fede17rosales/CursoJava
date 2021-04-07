package test;

import domain.Gerente;

public class TestSobreEscritura {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Fede", 100.0, "La Rioja");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
    }

}
