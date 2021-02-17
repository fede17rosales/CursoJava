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
public class Switch {

    public static void main(String[] args) {

        var numero = 2;
        var numeroTexto = "valor desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);

        // Ejercicio Switch
        var mes = 1;
        var estacion = "Estacion desconocida";

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Verano";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Otoño";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Invierno";
                break;
            case 9:
            case 10:
            case 11:
                break;
            default:
                estacion = "Estacion desconocida";
        }
        System.out.println("estacion = " + estacion);

    }
}
