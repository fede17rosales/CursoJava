package test;

import domain.Persona;

public class TestArreglosObject {

    public static void main(String[] args) {
        Persona personas[] = new Persona[2]; // nuevo arreglo de tipo objecto de la clase persona

        personas[0] = new Persona("Fede");
        personas[1] = new Persona("Carlos");

        System.out.println("personas [0] = " + personas[0]);
        System.out.println("personas [1] = " + personas[1]);

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Personas " + i + " = " + personas[i]);
        }

        String frutas[] = {"naranja", "duranzo", "platano", "banana", "uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
    }
}
