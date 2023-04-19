package Clase_14;

public class Persona {

    private String nombre;

    private String cedula;

    private boolean isEstacion; // True significa que esta en la estacion

    public Persona(String nombre, String cedula, boolean isEstacion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.isEstacion = isEstacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isEstacion() {
        return isEstacion;
    }

    public void setEstacion(boolean estacion) {
        isEstacion = estacion;
    }
}
