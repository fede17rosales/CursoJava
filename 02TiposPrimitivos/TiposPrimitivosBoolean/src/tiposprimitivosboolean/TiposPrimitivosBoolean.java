/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivosboolean;

/**
 *
 * @author Federico
 */
public class TiposPrimitivosBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean == true) {
            System.out.println("La bandera es verdera");
        } else {
            System.out.println("La bandera es falsa");
        }

        var Edad = 30;
        var esAdulo = Edad >= 18; // usamos la inferencia de tipos

        if (esAdulo) {
            System.out.println("Eres Mayor de Edad");
        } else {
            System.out.println("Eres menor de Edad");
        }

    }

}
