
package paquete1;


class Clase4 {
    private String atributoPrivado = "Valor atributo Privado";
    
    private Clase4(){
        System.out.println("Constructor Privado");
    }
    public Clase4(String argumento){
        this();
        System.out.println("Constructor Publico");
    }
    
    private void metodoPrivado(){
        System.out.println("Metodo Privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
}
