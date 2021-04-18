package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersona {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        // Listado de personas
        List<Persona> personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

    }

}
