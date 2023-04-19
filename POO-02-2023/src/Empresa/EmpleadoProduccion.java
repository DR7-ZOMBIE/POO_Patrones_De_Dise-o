package Empresa;

public class EmpleadoProduccion extends Empleado{

    private int tiempoExperencia;

    public EmpleadoProduccion(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    @Override
    public void trabajar() {
        System.out.println("Empleado de produccion" + getNombre() + "Trabajando");
    }
}
