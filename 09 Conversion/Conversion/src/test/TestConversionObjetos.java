
package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;

public class TestConversionObjetos {
       public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000,TipoEscritura.CLASICO);
        
       // System.out.println("empleado = " + empleado);
        
       // System.out.println(empleado.obtenerDetalles());
       
        // Dowcasting
       //((Escritor)empleado).getTipoEscritura(); // convirtiendo una refencia de una clase padre a un hijo: Dowcasting
       Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.getTipoEscritura());
       //Upcasting
       Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
