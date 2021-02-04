
import java.util.Scanner;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor /
 *
 * /**
 *
 * @author Federico
 */
public class Ingresodatos {

    public static void main(String Args[]) {
        System.out.println("Escribe tu nombre:");
        // clase Scanner nos permite ingresar datos
        Scanner consola = new Scanner(System.in); // creamos un nuevo objeto, con System(es un objeto de java) nos va permitir ingresar los datos
        var usuario = consola.nextLine(); // usamos el metodo nextLine(): que va leer informacion de la consola y va asignar a la variable usuario
        System.out.println("usuario = " + usuario);
        System.out.println("Escribre el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }

}
