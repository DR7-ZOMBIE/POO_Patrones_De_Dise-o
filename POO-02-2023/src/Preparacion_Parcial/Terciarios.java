package Preparacion_Parcial;

import java.time.LocalDate;

public class Terciarios extends Titulo {

    private boolean isNacional = true; // True es nacional


    public Terciarios(LocalDate fechaInicio, LocalDate fechaFinalizacion, boolean selladoMinisterio, boolean selladoInstituto, Materia[] materias, Persona persona,boolean isNacional) {
        super(fechaInicio, fechaFinalizacion, selladoMinisterio, selladoInstituto, materias, persona);

        this.isNacional = isNacional;
    }

    public boolean isNacional() {
        return isNacional;
    }

    public void setNacional(boolean nacional) {
        isNacional = nacional;
    }

    public boolean verificarIsNacional (){
        if (isNacional == true) return true;
        return false;
    }

}
