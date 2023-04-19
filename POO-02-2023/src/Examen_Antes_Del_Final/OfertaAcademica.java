package Examen_Antes_Del_Final;

public abstract class OfertaAcademica {

    private String nombre;

    private String description;

    public abstract double calcularPrecio();

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public String getNombre() {
        return nombre;
    }
}
