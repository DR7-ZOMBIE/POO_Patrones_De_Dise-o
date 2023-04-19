package Clase_14;

public class Boleto {

    private double precio = 50;

    public Boleto(double precio) {
        this.precio = precio;
    }

    public Boleto(){

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
