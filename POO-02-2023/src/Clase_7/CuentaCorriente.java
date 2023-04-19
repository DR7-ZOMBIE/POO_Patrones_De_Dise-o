package Clase_7;

public class CuentaCorriente extends Cuenta{

    private double descubierto = 1000;
    public CuentaCorriente(String numero, double saldo) {
        super(numero, saldo);
    }

    public double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }
}
