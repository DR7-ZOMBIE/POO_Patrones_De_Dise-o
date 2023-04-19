package Dennis_Patrick_Juilland_Prada;

import java.time.LocalDate;

public abstract class Vehiculo {

    protected String placa;
    protected String marca;
    protected String modelo;
    protected double cotizacion;
    protected LocalDate fechaAdquisicion;
    protected boolean isNacional = true; // Es nacional

    protected Propietario propietario;


    // Metodo dentro de Vehiculo, para verificar si es industria nacional no se
    // asigna abstracto, ya que no requiere ser modificado por las clases que heredan
    // Seria inecesario

    public  String isIndustriaNacional(){
        if (this.isNacional == true) return "Es industria Nacional";
        else return "No es industria nacional";
    }
}
