package Test;

import Dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {

        Persona persona = new Persona("Fede", 5000.00, true);
        System.out.println("Persona1 :" + persona.toString());

        persona.setNombre("Nicolas");
        System.out.println("Persona nombre = " + persona.getNombre());
        System.out.println("Persona sueldo = " + persona.getSueldo());
        System.out.println("Persona eliminado = " + persona.isEliminado());

        System.out.println("Persona1 :" + persona.toString());
    }
}
