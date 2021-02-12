/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresigualdadrelaciones;

/**
 *
 * @author Federico
 */
public class OperadoresIgualdadRelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var a = 3;
        var b = 2;

        var c = (a == b); // operador igualdad ==
        System.out.println("c = " + c); 
        
        var d = a != b;
        System.out.println("d = " + d);

        var cadena1 = "hola";
        var cadena2 = "hola";
        
        var e = cadena1 == cadena2; // compara referencias de objetos
        System.out.println("e = " + e);
             
        var f = cadena1.equals(cadena2);
        System.out.println("f = " + f);
        
        // Operadores Relacionales
         var g = a >= b;
         System.out.println("g = " + g);
         
         if(a % 2 == 0 ){
             System.out.println("Es par.");
         }
         else {
             System.out.println("Es impar.");
         }
         
         var edad = 30;
         var adulto  = 18;
         
         if(edad >= adulto){
             System.out.println("Es adulto");
         }
         else{
             System.out.println("Es menor de edad");
         }
    }

}
