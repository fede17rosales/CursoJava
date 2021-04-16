package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestUsuario {

    public static void main(String[] args) {
        UsuarioDAO usuariodao = new UsuarioDAO();
        // insertar un usuario
        Usuario usuarioNuevo = new Usuario("juan", "12345");
        usuariodao.insertar(usuarioNuevo);

        // actualizar un usuario
        Usuario usuarioModificar = new Usuario(2, "Juancho", "4987");
        usuariodao.actualizar(usuarioModificar);
        // eliminar usuario
        Usuario usuarioEliminado = new Usuario(2);
        usuariodao.eliminar(usuarioEliminado);
        // Listado de usuarios
        List<Usuario> usuarios = usuariodao.seleccionar();
        usuarios.forEach(usuario -> {
            System.out.println("persona = " + usuario);
        });

    }
}
