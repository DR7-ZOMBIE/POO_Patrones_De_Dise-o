package Preparacion_Parcial;

import java.time.LocalDate;

public class Licenciatura extends Titulo implements  Comparable<Licenciatura>{

    private String tema;

    private LocalDate fechaEntrega;

    private int cantidadTrabajo;

    public Licenciatura(LocalDate fechaInicio, LocalDate fechaFinalizacion, boolean selladoMinisterio, boolean selladoInstituto,
                        Materia[] materias, Persona persona, String tema, LocalDate fechaEntrega, int cantidadTrabajo) {
        super(fechaInicio, fechaFinalizacion, selladoMinisterio, selladoInstituto, materias, persona);
        this.tema = tema;
        this.fechaEntrega = fechaEntrega;
        this.cantidadTrabajo = cantidadTrabajo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getCantidadTrabajo() {
        return cantidadTrabajo;
    }

    public void setCantidadTrabajo(int cantidadTrabajo) {
        this.cantidadTrabajo = cantidadTrabajo;
    }


    @Override
    public int compareTo(Licenciatura o) {
        if (this.cantidadTrabajo > o.getCantidadTrabajo()) return 1;
        else if (this.cantidadTrabajo < o.getCantidadTrabajo()) return -1;
        return 0;
    }

}
