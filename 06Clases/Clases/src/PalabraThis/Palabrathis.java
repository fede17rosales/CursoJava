
package PalabraThis;

public class Palabrathis {
    public static void main(String[] args) {
        Persona persona = new Persona("Fede","Rosales");
        System.out.println("persona = " + persona);
    }
    
}

class Persona{
        String nombre;
        String apellido;
        
        Persona(String nombre, String apellido){
            this.nombre= nombre;
            this.apellido = apellido;
        }
    }