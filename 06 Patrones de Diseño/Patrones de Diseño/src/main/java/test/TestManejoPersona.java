package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.PersonaDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestManejoPersona {

    public static void main(String[] args) {

        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false); // necesitamos que el commit no se haga automaticamente
            }

            PersonaDAO personaDao = new PersonaDAO();

            List<PersonaDTO> personas = personaDao.seleccionar();

            for (PersonaDTO persona : personas) {
                System.out.println("Persona DTO: " + persona);
            }

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
