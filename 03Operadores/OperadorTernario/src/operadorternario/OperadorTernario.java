/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author Federico
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var resultado = (3 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado);
        
        var number = 8;
        resultado = (number % 2 == 0) ? "Numero Par" : "NumeroInpar";
        System.out.println("resultado = " + resultado);
        
    }
    
}
