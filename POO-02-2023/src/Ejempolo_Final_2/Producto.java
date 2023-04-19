package Ejempolo_Final_2;

public abstract class Producto {

    private String nombre;

    private String color;

    private double costo;

    private final double margenDeGanacia = 0.30;

    public double calcularCostoProductos(){
        return this.costo + (this.margenDeGanacia * this.costo);
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

    public double getMargenDeGanacia() {
        return margenDeGanacia;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", costo=" + costo +
                ", margenDeGanacia=" + margenDeGanacia +
                '}';
    }
}
