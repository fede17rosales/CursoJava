package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Fede", 5000.00);
        System.out.println("empleado1 = " + empleado1);
     
//        var fecha = new Date();
//        Cliente cliente = new Cliente(fecha, true, "Fede", 'F', 26, "Panamericano");
//        System.out.println("cliente = " + cliente);
    }
}
