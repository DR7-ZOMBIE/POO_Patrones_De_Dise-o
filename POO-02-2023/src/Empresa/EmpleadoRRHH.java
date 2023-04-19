package Empresa;

public class EmpleadoRRHH extends Empleado{
    private int altasLogradas;

    public EmpleadoRRHH(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    @Override
    public void trabajar() {
        System.out.println("Empleado" + getNombre() + "Trabajando");

    }


}
