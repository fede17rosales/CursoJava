/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresasignacion;

/**
 *
 * @author Federico
 */
public class OperadoresAsignacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // codigo va aqui
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("c = " + c);
        
        a += 1; // equivalente de a = a + 1;
        System.out.println("a = " + a);
        
        a += 3;
        System.out.println("a = " + a);
        
        a -= 2; // equivalente de poner a = a -2;
        System.out.println("a = " + a);
        
        a *= 2;
        System.out.println("a = " + a);
        a /= 2;
        System.out.println("a = " + a);
        a %= 2;
        System.out.println("a = " + a);
    }
    
}
