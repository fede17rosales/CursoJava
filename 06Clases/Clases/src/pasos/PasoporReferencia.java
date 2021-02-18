/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasos;

import clases.Persona;

/**
 *
 * @author Federico
 */
public class PasoporReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Fede";
        persona1.apellido = "Rosales";
        System.out.println("persona1 nombre= " + persona1.nombre);
        persona1 = cambiaValor(persona1);
        System.out.println("persona1 nombre= " + persona1.nombre);

    }

    public static Persona cambiaValor(Persona persona) {
        if (persona == null) {
            System.out.println("Valor de persona Invalido");
            return null;
        }
        persona.nombre = "Nico";
        return persona;
    }
}
