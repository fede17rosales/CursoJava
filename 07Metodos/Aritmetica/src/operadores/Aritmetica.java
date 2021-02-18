package operadores;

/**
 *
 * @author Federico
 */
public class Aritmetica {

    // atributos
    int a;
    int b;

    // constructor vacio
    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }

    // sobrecarga de constructor
//    public Aritmetica(int a,int b){
//        this.a = a;
//        this.b = b;
//        System.out.println("ejecutando constructor con parametros");
//    }
    // Metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        return (a + b);
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }

}
