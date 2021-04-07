package test;

import domain.Persona;

public class Test {
    
    public static void main(String[] args) {
        int edades[] = {5, 6, 7, 8, 9};
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Juan"), new Persona("Fede"), new Persona("Nico")};
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }
    
}
