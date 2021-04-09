package test;

import domain.Gerente;
import domain.Empleado;

public class TestIntanceOf {

    public static void main(String[] args) {

//        Empleado empleado = new Empleado("Juan", 5000);
//        determinarTipo(empleado);
        Gerente gerente1 = new Gerente("Fede", 100.0, "La Rioja");
        determinarTipo(gerente1);
    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {    // preguntamos si es de tipo hijo
            System.out.println("Es de tipo Gerente");
            Gerente gerente  = (Gerente)empleado;
            gerente.getDepartamento();
            System.out.println("gerente = " + gerente.getDepartamento());
        }
        if (empleado instanceof Empleado){  // sino preguntamos si es de tipo padre
            System.out.println("Es de tipo Empleado");
        }
        if (empleado instanceof Object){  // consulta si es de tipo Objeto
            System.out.println("Es de tipo Object");
        }
    }
}
