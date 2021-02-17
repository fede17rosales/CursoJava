/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Federico
 */
public class PruebaPersona {

    public static void main(String[] args) {
        // Persona persona1; definimos una variable de tipo persona
        Persona persona1 = new Persona(); // Creamos un objeto

        persona1.nombre = "Juan"; // accedemos a los atributos por medio de esta asignación
        persona1.apellido = "Perez";
        System.out.println("persona1 = " + persona1);

        persona1.desplegarInformación(); // llamamos al metodo para deplegar la informacion

        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        persona2.apellido = "Rosales";
        persona2.nombre= "Federico";
        persona2.desplegarInformación();
    }

}
