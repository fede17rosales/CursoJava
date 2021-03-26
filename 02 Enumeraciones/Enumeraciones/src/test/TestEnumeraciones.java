/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author Federico
 */
public class TestEnumeraciones {

    public static void main(String[] args) {
//        System.out.println("Dia 1: " + Dias.JUEVES);
//        indicarDiaSemana(Dias.LUNES);

        System.out.println("Continente N° 4: " + Continentes.AMERICA);
        System.out.println("Paises en el 4to continente: " + Continentes.AMERICA.getPaises());
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer día de la Semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la Semana");
                break;
        }
    }
}
