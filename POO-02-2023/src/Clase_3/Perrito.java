package Clase_3;

public class Perrito {

    public String nombre;
    public String raza;

    public double[] pauqetes = new double[0];


    public Perrito(String nombre, String raza, double[] pauqetes) {
        this.nombre = nombre;
        this.raza = raza;
        this.pauqetes = pauqetes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public double[] getPauqetes() {
        return pauqetes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPauqetes(double[] pauqetes) {
        this.pauqetes = pauqetes;
    }
}
