/*
El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
El usuario proporcionará un valor entre 0 y 10.

Si está entre 9 y 10: imprimir una A
Si está entre 8 y menor a 9: imprimir una B
Si está entre 7 y menor a 8: imprimir una C
Si está entre 6 y menor a 7: imprimir una D
Si está entre 0 y menor a 6: imprimir una F
cualquier otro valor debe imprimir: Valor desconocido

Por ejemplo:
    Proporciona un valor entre 0 y 10:
    A 
 */
package sentenciasdecontrol;

import java.util.Scanner;

/**
 *
 * @author Federico
 */
public class EjercicioNotas {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        var nota = Integer.parseInt(consola.nextLine());

        if (nota >= 9 && nota <= 10) {
            System.out.println("A");
        } else if (nota >= 8 && nota <= 9) {
            System.out.println("B");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("C");
        } else if (nota >= 6 && nota <= 7) {
            System.out.println("D");
        } else if (nota >= 0 && nota <= 6) {
            System.out.println("F");
        }

    }
}
