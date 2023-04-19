package clase_5;

public class Auto {

    private String modelo;
    private double precioVenta;
    private int velocidadMaxima;
    private int velocidadMinima;

    private int velocidadActual;

    private double valorCombustible;

    public Auto(String modelo, double precioVenta, int velocidadMaxima, int velocidadMinima, double valorCombustible) {
        this.modelo = modelo;
        this.precioVenta = precioVenta;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadMinima = velocidadMinima;
        this.valorCombustible = valorCombustible;
    }

    public void setModelo(String modcelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMinima() {
        return velocidadMinima;
    }

    public void setVelocidadMinima(int velocidadMinima) {
        this.velocidadMinima = velocidadMinima;
    }

    public double getValorCombustible() {
        return valorCombustible;
    }

    public void setValorCombustible(double valorCombustible) {
        this.valorCombustible = valorCombustible;
    }

    public void acelerar (int velocidad){
        if (velocidadActual < velocidad + velocidadActual) {
            this.velocidadActual += velocidad;
        }else{
            this.velocidadActual = velocidad;
        }

    }

    public void frenar (int velocidad){
        if (velocidadActual - velocidad >= 0) {
            this.velocidadActual -= velocidad;
        }else{
            velocidadActual = velocidad;
        }
    }
}
