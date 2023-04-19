package Ejemplo_Parcial_Final_1;

public abstract class Producto {

    private String nombre;

    private String color;

    private double costo;

    private final double margenGananciaPorcentual = 0.30;

    public double precioProductos(){
        return this.costo + costo*margenGananciaPorcentual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getMargenGananciaPorcentual() {
        return margenGananciaPorcentual;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", costo=" + costo +
                ", margenGananciaPorcentual=" + margenGananciaPorcentual +
                '}';
    }
}
