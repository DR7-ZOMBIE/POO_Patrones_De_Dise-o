package Colecciones_Clase_01;

public class Contenedor implements Comparable<Contenedor> {

    private String numeroID;

    private String pais;

    private boolean isPeligroso;

    private int cantidadAlmacenada;

    public Contenedor(String numeroID, String pais, boolean isPeligroso) {
        this.numeroID = numeroID;
        this.pais = pais;
        this.isPeligroso = isPeligroso;
    }

    public String getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(String numeroID) {
        this.numeroID = numeroID;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isPeligroso() {
        return isPeligroso;
    }

    public void setPeligroso(boolean peligroso) {
        isPeligroso = peligroso;
    }

    public int getCantidadAlmacenada() {
        return cantidadAlmacenada;
    }

    public void setCantidadAlmacenada(int cantidadAlmacenada) {
        this.cantidadAlmacenada = cantidadAlmacenada;
    }

    @Override
    public int compareTo(Contenedor contenedor) {
        if(this.numeroID.compareTo(contenedor.getNumeroID()) > 1 ) return 1;
        else if (this.cantidadAlmacenada < contenedor.getCantidadAlmacenada()) return -1;
        else return 0;
    }

//    @Override
//    public int compareTo(Contenedor contenedor) {
//        if(this.numeroID.compareTo(contenedor.getNumeroID())>1) return 1;
//        else if (this.numeroID.compareTo(contenedor.getNumeroID())<1) return -1;
//        else return 0;
//    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "numeroID='" + numeroID + '\'' +
                ", pais='" + pais + '\'' +
                ", isPeligroso=" + isPeligroso +
                '}';
    }
}
