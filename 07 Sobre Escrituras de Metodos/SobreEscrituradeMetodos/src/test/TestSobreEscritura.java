package test;

import domain.Gerente;
import domain.Empleado;

public class TestSobreEscritura {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Fede", 100.0, "La Rioja");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());

        // polimorfismo
        Empleado empleado = new Empleado("Juan", 5000);
        imprimir(empleado);
        
        imprimir(gerente1);
    }

    public static void imprimir(Empleado empleado) {
        String detalles = empleado.obtenerDetalles();
        System.out.println("detalles = " + detalles);
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
