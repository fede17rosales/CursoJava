package operadores;

/**
 *
 * @author Federico
 */
public class Aritmetica {

    // atributos
    int a;
    int b;

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
