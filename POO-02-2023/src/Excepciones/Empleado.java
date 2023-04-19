package Excepciones;

class Empleado{
    private String nombre;
    private String apellido;
    private int sueldo;

    public static void main(String[] args) {
        Empleado e = new Empleado("carlos","dfd",-20);
    }

    public Empleado(String nombre, String apellido, int sueldo) throws RuntimeException {

            this.nombre=nombre;
            this.apellido=apellido;
            this.sueldo=sueldo;

            if (nombre == null || nombre == "" ) throw new RuntimeException("Nombre no puede estar vacío");
            else if(apellido == null || apellido == "")   throw new RuntimeException("Apellido no puede estar vacío");
            else if(sueldo <= 0)  throw new RuntimeException("Sueldo no puede ser menor o igual a cero");


    }

    //No modificar
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getSueldo() {
        return sueldo;
    }
}