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
public class PruebaCaja {

    public static void main(String[] args) {

        Caja box = new Caja();
        box.alto = 2;
        box.ancho = 3;
        box.profundo = 6;
        box.calcularVolumen();

    }
}
