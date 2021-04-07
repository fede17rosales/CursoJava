package domain;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    // sobreescritura de metodos
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + this.departamento;
    }
}
