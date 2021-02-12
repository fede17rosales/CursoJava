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
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado de la suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado de la resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado de la multiplicación = " + resultado);
        
        resultado = a / b;
        System.out.println("resultado de la division = " + resultado);
 
        resultado = a % b;
        System.out.println("resultado de modulo = " + resultado);
    

        if (a % 2 == 0){
            System.out.println("Es numero par");
        }else {
            System.out.println("No es numero par");
        }
        
    }
}
    

