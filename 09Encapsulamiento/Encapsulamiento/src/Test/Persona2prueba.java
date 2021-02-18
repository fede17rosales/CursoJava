/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Dominio.Persona2;

/**
 *
 * @author Federico
 */
public class Persona2prueba {
    public static void main(String[] args) {
        Persona2 persona2 = new Persona2("Fede");
        Persona2 persona3 = new Persona2("Carla");
        imprimir(persona2);
        imprimir(persona3);
    }
    
    public static void imprimir(Persona2 persona){
        System.out.println("persona = " + persona);

    }
}
