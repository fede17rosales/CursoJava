package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList(); // List: guarda el orden y se pueden duplicar los elementos
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
//         imprimir(miLista);

        Set miSet = new HashSet(); // no guarda el orden de insercion de los elementos y descarta los duplicados 
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        // imprimir(miSet);

        Map miMapa = new HashMap();
        miMapa.put("Valor1", "Fede");
        miMapa.put("Valor2", "Juan");
        miMapa.put("Valor3", "Cristian");
        miMapa.put("Valor4", "Maga");

        String elemento = (String) miMapa.get("Valor1");
//        System.out.println("elemento = " + elemento);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }

    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
