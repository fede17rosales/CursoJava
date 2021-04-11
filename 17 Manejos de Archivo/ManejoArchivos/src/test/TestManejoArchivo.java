package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivo {

    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
//       crearArchivo(nombreArchivo);// crea el archivo
//       anexarArchivo(nombreArchivo,"Hola desde Java");
//       anexarArchivo(nombreArchivo,"que onda");
//       anexarArchivo(nombreArchivo,"vamoo");

        leerArchivo(nombreArchivo);

    }

}
