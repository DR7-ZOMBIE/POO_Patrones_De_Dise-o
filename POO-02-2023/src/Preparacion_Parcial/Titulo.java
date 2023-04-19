package Preparacion_Parcial;

import java.time.LocalDate;

public abstract class Titulo {

    private LocalDate fechaInicio;
    private LocalDate fechaFinalizacion;

    private boolean selladoMinisterio = true; // True es sellado

    private boolean selladoInstituto = true; // True es sellado


    private Materia[] materias = new Materia[0];

    private Persona persona = new Persona();

    public Titulo(LocalDate fechaInicio, LocalDate fechaFinalizacion, boolean selladoMinisterio, boolean selladoInstituto, Materia[] materias, Persona persona) {
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.selladoMinisterio = selladoMinisterio;
        this.selladoInstituto = selladoInstituto;
        this.materias = materias;
        this.persona = persona;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public boolean isSelladoMinisterio() {
        return selladoMinisterio;
    }

    public void setSelladoMinisterio(boolean selladoMinisterio) {
        this.selladoMinisterio = selladoMinisterio;
    }

    public boolean isSelladoInstituto() {
        return selladoInstituto;
    }

    public void setSelladoInstituto(boolean selladoInstituto) {
        this.selladoInstituto = selladoInstituto;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public boolean ejercerTitulo(){
        if (this.selladoMinisterio == true && this.selladoInstituto == true) {
            return true;
        }
        return false;
    }



}
