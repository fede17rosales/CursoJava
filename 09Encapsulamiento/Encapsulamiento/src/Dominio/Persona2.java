/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Federico
 */
public class Persona2 {

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;

    public Persona2(String nombre) {
        this.nombre = nombre;
        Persona2.contadorPersonas++;
        this.idPersona = Persona2.contadorPersonas;

    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override // estamos sobreescribiendo el metodo toString
    public String toString() {
        return "Persona2{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

}
