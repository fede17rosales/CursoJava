package test;

public class TestArreglos {

    public static void main(String[] args) {
        int edades[] = new int[3]; // definimos el arreglo de tipo primitivo
        System.out.println("edades = " + edades);

        edades[0] = 2; // modificamos el valor del primer elemento
        System.out.println("edades = " + edades[0]);

        //edades[3]=5;
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edades elemento" + i + ":" + edades[i]);
        }
    }
}
