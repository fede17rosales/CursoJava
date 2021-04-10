package test;

import accesodatos.AccesoDatos;
import accesodatos.ImplementacionMySQL;
import accesodatos.ImplementacionOracle;

public class TestInterfaces {

    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySQL();
        datos.listar();
        imprimir(datos);
        
        datos = new ImplementacionOracle();
        datos.listar();
    }

    public static void imprimir(AccesoDatos datos) {
        datos.listar();
    }
}
