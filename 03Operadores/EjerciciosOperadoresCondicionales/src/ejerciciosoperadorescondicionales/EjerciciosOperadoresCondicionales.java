/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosoperadorescondicionales;

/**
 *
 * @author Federico
 */
public class EjerciciosOperadoresCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var a = 8;
        var valueMin = 0;
        var valueMax = 10;

        var resultado = a >= 0 && a <= 10;
        if (resultado) {
            System.out.println("Dentro del rango");
        } else {
            System.out.println("Fuera del rango");
        }

        var holidays = false;
        var dayFree = true;

        if (holidays || dayFree) {
            System.out.println("Padre puede asistir  al juego del hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }

    }

}
