/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02variables;

/**
 *
 * @author Federico
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        // modificamos el valor de nuestra variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        // CTRL+Espacio autocompleta las variables
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        // var - Inferencia de tipos de datos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Que haces";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        // escribimos soutv y te trae la variable
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        // reglas para escribir una variable, se aconseja :
         var miVariable = 1;
         var _miVariable = 2;
         var $miVariable =3;
         // var áVariable = 10; -> no se recomienda utilizar acento
         // No esta permitido utilizar caracteres especiales
         
         
         
    }
    
}
