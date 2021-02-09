/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotiposprimitivos1;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class EjercicioTiposPrimitivos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Convertir un tipo String a un tipo Int
//       var edad = Integer.parseInt("20");  // el metodo parseInt es un metodo de la clase Integer
//       System.out.println("edad = " + (edad + 1));
//       
//       var edad2 = "20";  // sin el metodo de la clase
//       System.out.println("edad = " + (edad2 + 1));
//       
//       var valorPI = Double.parseDouble("3.14");
//        System.out.println("valorPI = " + valorPI);
//
//        // pedir un valor
        var consola = new Scanner(System.in); // creamos un nuevo objeto
//        System.out.println("Proporciona tu edad: ");
//        edad = Integer.parseInt(consola.nextLine()); // pasamos el argumento de la consola
//        System.out.println("edad = " + edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter:");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
    }
    
}
