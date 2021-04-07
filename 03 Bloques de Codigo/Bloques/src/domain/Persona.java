package domain;

public class Persona {

    private final int IdPersona;
    private static int contadorPersonas;

    static {
        System.out.println("Ejecución Bloque Estatico");
        ++Persona.contadorPersonas;
        // idPersona = 10;
    }

    {
        System.out.println("Ejecución Bloque NO estatico");
        this.IdPersona = Persona.contadorPersonas++;
    }

    public Persona() {
        System.out.println("Ejecución del Constructor");
    }

    public int getIdPersona() {
        return IdPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "IdPersona=" + IdPersona + '}';
    }

}
