package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersona {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        // Insertando una nueva persona
        Persona personaNueva = new Persona("Victoria", "Rosales", "vocky@gmail.com", "3804368947");
        personaDao.insertar(personaNueva);
        // Modificar un Objecto existente
        Persona personaModificada = new Persona(6, "Victoria", "Rosales", "vicky@gmail.com", "3804368947");
        personaDao.actualizar(personaModificada);
        // Eliminar Registro
        Persona personaElimada = new Persona(8);
        personaDao.eliminar(personaElimada);
        // Listado de personas
        List<Persona> personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

    }

}
