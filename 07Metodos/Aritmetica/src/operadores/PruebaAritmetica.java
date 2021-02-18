/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author Federico
 */
public class PruebaAritmetica {

    public static void main(String[] args) {
        
        // variable local
        var a = 10;
        var b = 2;
        miMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica();

        aritmetica1.a = 2;
        aritmetica1.b = 3;
        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado usando argumentos = " + resultado);

    }
    
    public static void miMetodo() {
        
        System.out.println("Otro metodo");
    
    }
}
