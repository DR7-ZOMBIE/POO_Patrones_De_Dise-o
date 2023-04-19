package Clase_14;

public class Estacion {

    private String origen;

    private String destino;

    public Estacion(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Estacion{" +
                "origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}
