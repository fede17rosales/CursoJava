package argumentosvariables;

/**
 *
 * @author Federico
 */
public class ArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(1, 2, 3, 4);
        imprimirNumeros(5, 6, 7, 8);
        variosparametros("Fede",9,10,11);

    }

    private static void variosparametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: " + numeros[i]);
        }
    }
}
