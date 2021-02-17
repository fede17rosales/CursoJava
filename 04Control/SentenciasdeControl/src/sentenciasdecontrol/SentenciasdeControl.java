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
public class SentenciasdeControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var condicion = true;

        if (condicion) {
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion Falsa");
        }

        var numero = 2;
        var numeroTexto = "numero Desconocido";

        if (numero == 1) {
            numeroTexto = "Numero Uno";
        } else if (numero == 2) {
            numeroTexto = "Numero Dos";
        } else if (numero == 3) {
            numeroTexto = "Numero Tres";
        } else if (numero == 4) {
            numeroTexto = "Numero Cuatro";
        } else {
            numeroTexto = "Numero No encontrado";
        }

        System.out.println("numeroTexto = " + numeroTexto);
    }

}
