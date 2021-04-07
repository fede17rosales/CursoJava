package paquete1;

import paquete1.Clase3;
import paquete1.Clase1;
import paquete1.ClaseHija;

public class TestModificadoresdeAcceso {

    public static void main(String[] args) {

        // Public
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();

        System.out.println("");

        // Protected
        ClaseHija clasehija = new ClaseHija();
        System.out.println("clasehija = " + clasehija);

        System.out.println("");

        // deafult
        Clase3 clase3 = new Clase3();
        clase3.atributoDefault = "Cambios de la prueba";
        System.out.println("clase3 atributo = " + clase3.atributoDefault);
        clase3.metodoDefault();

        // Privado
        Clase4 clase4 = new Clase4("Publico");
        clase4.setAtributoPrivado("cambio valor atributo");
        System.out.println("clase 4 = " + clase4.getAtributoPrivado());
    }
}
