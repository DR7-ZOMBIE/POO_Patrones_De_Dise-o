package Empresa;

public class EmpleadoMarketing extends Empleado{

    private String area;

    public EmpleadoMarketing(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    @Override
    public void trabajar() {
        System.out.println("Empleado de marketing trabajando en:" + area);
    }

    public void trabajar(int horasExtras){
        System.out.println("Empleado de marketing trabajando en:" + area + "Con horas extras:" + horasExtras);

    }
}
