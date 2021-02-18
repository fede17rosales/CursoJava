package Dominio;

public class Persona {

    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado) { // consultor de la clase
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    // nombre

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // sueldo
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // eliminado
    public boolean isEliminado() {
        return this.eliminado;
    }

    public String toString(){
        return "Persona[ nombre: " + this.nombre + 
                ", sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado + "]";
    }
}
