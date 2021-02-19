package mx.com.gm.ventas;

public class Producto {

    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorproductos;

    private Producto() {
        this.idProducto = ++Producto.contadorproductos;
    }

    public Producto(String nombre, Double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

}
