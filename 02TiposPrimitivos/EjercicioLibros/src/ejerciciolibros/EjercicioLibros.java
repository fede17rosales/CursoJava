/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolibros;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class EjercicioLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        var consola = new Scanner(System.in); // creamos un nuevo objeto

        System.out.println("Proporciona el nombre:");
        var nombre = consola.nextLine();

        System.out.println("Proporciona el id:");
        var id = Integer.parseInt(consola.nextLine());

        System.out.println("Proporciona el precio:");
        var precio = Double.parseDouble(consola.nextLine());
        
        System.out.println("Proporciona el envio gratuito:");
        var envio = Boolean.parseBoolean(consola.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("precio = $" + precio);
        System.out.println("envio gratuito = " + envio);

    }

}
