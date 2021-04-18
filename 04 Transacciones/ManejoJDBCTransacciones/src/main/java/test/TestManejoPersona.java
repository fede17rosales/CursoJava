package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.*;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersona {

    public static void main(String[] args) {
        
            Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()){
                conexion.setAutoCommit(false); // necesitamos que el commit no se haga automaticamente
            }
        PersonaDAO personaDao = new PersonaDAO(conexion);
        
        // actualizar 
        Persona cambioPersona = new Persona();
        cambioPersona.setIdPersona(1);
        cambioPersona.setNombre("Federico");
        cambioPersona.setApellido("Rosales");
        cambioPersona.setEmail("fede17rosales@gmail.com");
        cambioPersona.setTelefono("3804368627");
        personaDao.actualizar(cambioPersona);
        
        // insertar
        Persona personaNueva = new Persona();
        personaNueva.setNombre("Carlos");
        personaNueva.setApellido("Lucca");
        personaNueva.setEmail("lucaC@hotmail.com");
        personaNueva.setTelefono("5665165465");
        personaDao.insertar(personaNueva);
        
        conexion.commit();
        
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos en el Rollback");
                try {
                    conexion.rollback();
                } catch (SQLException ex1) {
                    ex1.printStackTrace(System.out);
                }
        }

    }

}
