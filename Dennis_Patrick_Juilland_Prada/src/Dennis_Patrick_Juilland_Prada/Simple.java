package Dennis_Patrick_Juilland_Prada;

public class Simple extends Pizza{

    private double precioBase;

    private boolean isPromocion = false; // No esta en promocion

    private final double DESCUENTO = 0.10;


    @Override
    public double calcularPrecio() {
        if (isPromocion) return this.precioBase - (this.precioBase* this.DESCUENTO);
        else return this.precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isPromocion() {
        return isPromocion;
    }

    public void setPromocion(boolean promocion) {
        isPromocion = promocion;
    }

    public double getDESCUENTO() {
        return DESCUENTO;
    }

}
