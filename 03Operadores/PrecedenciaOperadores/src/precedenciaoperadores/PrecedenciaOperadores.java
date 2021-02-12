/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precedenciaoperadores;

/**
 *
 * @author Federico
 */
public class PrecedenciaOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado = 4 + 5 * 6 /3; //4 + 5 ((5*6)/3)
        System.out.println("resultado = " + resultado);
        
          var resultado2 = (4 + 5) * 6 /3; 
        System.out.println("resultado2 = " + resultado2);
    }
    
}
