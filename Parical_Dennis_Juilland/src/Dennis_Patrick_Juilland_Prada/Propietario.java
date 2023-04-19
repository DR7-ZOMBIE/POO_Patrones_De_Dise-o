package Dennis_Patrick_Juilland_Prada;

public class Propietario {

    private String nombre;
    private String DNI;
    private String apellido;

    // Constructor del propietario con sus atributos

    public Propietario(String nombre, String DNI, String apellido) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
