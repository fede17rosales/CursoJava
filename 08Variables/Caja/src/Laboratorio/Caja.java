/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio;

/**
 *
 * @author Federico
 */
public class Caja {

    // atributos
    int ancho;
    int alto;
    int profundo;

    public Caja() {
        System.out.println("Ejecutando constructor Caja Vacia");
    }

    public Caja(int a, int b, int c) {
        this.ancho = a;
        this.alto = b;
        this.profundo = c;
        System.out.println("ejecutando constructor con parametros");
    }

    // metodo 
    public void calcularVolumen() {
        int Volumen = ancho * alto * profundo;
        System.out.println("Volumen = " + Volumen);
    }

}
