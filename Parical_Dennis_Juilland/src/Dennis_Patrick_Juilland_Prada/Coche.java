package Dennis_Patrick_Juilland_Prada;

import java.time.LocalDate;

public class Coche extends Vehiculo{

    private boolean tieneGNC;

    private double cilindraje;


    public boolean isTieneGNC() {
        return tieneGNC;
    }

    public void setTieneGNC(boolean tieneGNC) {
        this.tieneGNC = tieneGNC;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Metodo para verificar si es economico, tener en cuenta que en el enunciado esta escrito
    // con un o lo implica utilizar un OR

    public boolean isEconomico(){
        if (this.tieneGNC == true || this.cilindraje < 1200) return true;
        return false;
    }
}
