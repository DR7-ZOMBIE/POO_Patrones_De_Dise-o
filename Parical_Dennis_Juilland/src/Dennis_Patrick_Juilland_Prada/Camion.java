package Dennis_Patrick_Juilland_Prada;

import java.time.LocalDate;

public class Camion extends Vehiculo implements Comparable<Camion>{


    private int cantidadEjes;

    private double capacidadCargaT;

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    public double getCapacidadCargaT() {
        return capacidadCargaT;
    }

    public void setCapacidadCargaT(double capacidadCargaT) {
        this.capacidadCargaT = capacidadCargaT;
    }

    // Metodo para comparar por capacidad de carga entre dos Camiones

    @Override
    public int compareTo(Camion o) {
        if (this.capacidadCargaT > o.getCapacidadCargaT()) return 1;
        else if(this.capacidadCargaT < o.getCapacidadCargaT()) return -1;
        return 0;
    }
}
