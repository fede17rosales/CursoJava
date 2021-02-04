/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Federico
 */
public class Concatenacion {

    public static void main(String Args[]) {

        var usuario = "Fede";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;

        // System.out.println("usuario = " + usuario);
        // System.out.println("titulo = " + titulo);
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j); // suma de numeros
        System.out.println(i + j + usuario); // al tener valores numericos al principio se hace la suma y despues la concatenacion
        System.out.println(usuario + i + j); // al tener al reves no se realiza la suma y se concatena al final, si encuentra una cadena el resto lo toma como una cadena
        System.out.println(usuario + (i + j)); // en este caso evalua los parentesis y en ese caso realiza la suma primero. Obteniendo como resultado : Fede7

    }

}
