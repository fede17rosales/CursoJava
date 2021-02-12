/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Proporciona el alto = ");
        Scanner consola = new Scanner(System.in);
        int alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho = ");
        int ancho = Integer.parseInt(consola.nextLine());
        System.out.println("Area: " + ancho * alto);
        System.out.println("Perimetro: " + (ancho + alto) * 2);

    }

}
