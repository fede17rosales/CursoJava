
package test;

import genericos.Clasegenerica;

public class ClasesGenericas {
    public static void main(String[] args) {
        Clasegenerica<Integer> ObjetoInt = new Clasegenerica(15);
        ObjetoInt.obtenerTipo();
    
        Clasegenerica<String> objectoString = new Clasegenerica("Hola");
        objectoString.obtenerTipo();
    }
}
