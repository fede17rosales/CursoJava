package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;


public class TestUsuario {

    public static void main(String[] args) {
        UsuarioDAO usuariodao = new UsuarioDAO();
       
         Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()){
                conexion.setAutoCommit(false); // necesitamos que el commit no se haga automaticamente
            }
        UsuarioDAO personaDao = new UsuarioDAO(conexion);
        
        // actualizar 
        Usuario cambioUsuario = new Usuario();
        cambioUsuario.setIdUsuario(1);
        cambioUsuario.setUsuario("Federico");
        cambioUsuario.setPassword("fede1707");
        personaDao.actualizar(cambioUsuario);
        
        // insertar
        Usuario usuarioNuevo = new Usuario();
        usuarioNuevo.setUsuario("Carlos");
        usuarioNuevo.setPassword("Ivana");
        personaDao.insertar(usuarioNuevo);
        
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
