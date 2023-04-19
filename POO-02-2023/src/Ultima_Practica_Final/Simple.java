package Ultima_Practica_Final;

public class Simple extends Unidad{

    private double montoPersona;

    private int cantidadPersonas;

    private final double PORCENTAJE_AUMENTO = 0.20;


    @Override
    public double calcularMonto() {
        if (this.cantidadPersonas > 10){
            return this.getMontoPersona() + (this.PORCENTAJE_AUMENTO*this.getMontoPersona());
        }
        return this.getMontoPersona();
    }

    public double getMontoPersona() {
        return montoPersona;
    }

    public void setMontoPersona(double montoPersona) {
        this.montoPersona = montoPersona;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public double getPORCENTAJE_AUMENTO() {
        return PORCENTAJE_AUMENTO;
    }

    @Override
    public String toString() {
        return "Simple{" +
                "montoPersona=" + montoPersona +
                ", cantidadPersonas=" + cantidadPersonas +
                ", PORCENTAJE_AUMENTO=" + PORCENTAJE_AUMENTO +
                '}';
    }
}
