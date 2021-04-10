package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10,resultado);
        }catch (OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion:");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Ocurrio un error: ");    
            e.printStackTrace(System.out); //  printStackTrace: imprimimos la pila de excepciones
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Se reviso  la division en cero");
        }
        System.out.println("resultado = " + resultado);
    }

}