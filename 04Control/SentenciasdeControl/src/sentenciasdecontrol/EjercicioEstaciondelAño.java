/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciasdecontrol;

/**
 *
 * @author Federico
 */
public class EjercicioEstaciondelAño {

    public static void main(String[] args) {
        var mes = 1;
        var estacion = "desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Verano";
            System.out.println("estacion = " + estacion);
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Otonio";
            System.out.println("estacion = " + estacion);
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Invierno";
            System.out.println("estacion = " + estacion);
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Primavera";
            System.out.println("estacion = " + estacion);
        }
    }
}
