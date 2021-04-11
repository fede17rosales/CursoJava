
package genericos;

public class Clasegenerica <T>{
    
    private T objeto;
    
    public Clasegenerica(T objecto){
        this.objeto = objecto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
