/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresunarios;

/**
 *
 * @author Federico
 */
public class OperadoresUnarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // cambio de signo
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // incremento 
        // 1. pre-incremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e; // se incrementa la variable y despues su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        // 2. pos-incremento 
        var g = 5;
        var h = g++; // se utiliza el valor de la variable y despues se incrementa
        System.out.println("g = " + g); // teniamos pendiente un incremento
        System.out.println("h = " + h);

        // Decremento
        // 1. pre-decremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);// ya esta decrementa
        System.out.println("j = " + j);
        // 2. pos-decremento
        var k = 4;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l); // primerp usa el valor de la variable y despues queda pendiente el decremento

    }

}
