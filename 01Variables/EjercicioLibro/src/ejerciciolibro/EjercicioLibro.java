/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolibro;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class EjercicioLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Proporciona el titulo: ");
        Scanner consola = new Scanner(System.in);
        var miTitulo = consola.nextLine();
        System.out.println("Proporciona el autor:");
        var miAutor = consola.nextLine();
        System.out.println(miTitulo + " fue escrito por: " + miAutor);

    }

}
