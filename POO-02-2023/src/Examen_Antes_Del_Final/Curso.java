package Examen_Antes_Del_Final;

public class Curso extends OfertaAcademica{

    private int cargaMensual;

    private int cantidadMeses;

    private double valorHoraDouble;
    @Override
    public double calcularPrecio() {
        return (this.cargaMensual*this.cantidadMeses)*this.valorHoraDouble;
    }

    public int getCargaMensual() {
        return cargaMensual;
    }

    public void setCargaMensual(int cargaMensual) {
        this.cargaMensual = cargaMensual;
    }

    public int getCantidadMeses() {
        return cantidadMeses;
    }

    public void setCantidadMeses(int cantidadMeses) {
        this.cantidadMeses = cantidadMeses;
    }

    public double getValorHorADouble() {
        return valorHoraDouble;
    }

    public void setValorHorADouble(double valorHorADouble) {
        this.valorHoraDouble = valorHorADouble;
    }
}
