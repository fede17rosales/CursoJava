/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int number1 = Integer.parseInt(console.nextLine());
        System.out.println("Proporciona el numero2:");
        int number2 = Integer.parseInt(console.nextLine());

        var numberMax = (number1 > number2) ? "numero 1 es mayor " : " numero 2 es mayor";
        System.out.println("numberMax = " + numberMax);

    }

}
