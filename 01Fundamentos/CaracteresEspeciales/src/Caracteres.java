/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Federico
 */
public class Caracteres {

    public static void main(String Args[]) {
        var nombre = "Karla";

        System.out.println("Nueva Linea: \n" + nombre); // salto de linea en la consola
        System.out.println("Tabulador: \t" + nombre);   // tabula el nombre
        System.out.println("Retroceso: \b\b" + nombre); // nos regresa una posicion, es decir nos elimino el espacio entre los dos puntos y el nombre Karla
        System.out.println("Comilla simple: \'" + nombre + "'"); // comillas simples
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }
}
