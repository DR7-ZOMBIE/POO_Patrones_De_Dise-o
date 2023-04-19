package Clase_14;

import java.util.LinkedList;

public class Recorrido {

    private LinkedList<Estacion> Estacion = new LinkedList<Estacion>();

    public Recorrido() {
//        Estacion = estacion;
    }

    public LinkedList getEstacion() {
        return Estacion;
    }

    public void setEstacion(LinkedList estacion) {
        Estacion = estacion;
    }

    public void agregarEstacion(Estacion e){
        Estacion.add(e);
    }

    public void verificarEstaciones(){
        for (int i = 0; i < Estacion.size() ; i++) {
            System.out.println(Estacion.get(i));
        }
    }

    public static void main(String[] args) {
        Estacion e = new Estacion("Medellin","Bogota");

        Recorrido r = new Recorrido();
        r.agregarEstacion(e);
        r.verificarEstaciones();

    }
}
