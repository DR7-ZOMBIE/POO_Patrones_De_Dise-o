package Patron_Observer;

import java.util.ArrayList;

public class Publicador implements Subject {

    private String nombre;

    private String apellido;

    private ArrayList<Observer> seguidores = new ArrayList<Observer>();

    public void subirFoto(){
        System.out.println("Subiendo foto por..." + " " + this.nombre);
        System.out.println("Se subio!");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Observer> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<Observer> seguidores) {
        this.seguidores = seguidores;
    }

    @Override
    public void agregar(Observer seguidor) {
    seguidores.add(seguidor);
    }

    @Override
    public void eliminar(Observer seguidor) {
        seguidores.remove(seguidor);

    }

    @Override
    public void notificar() {
        for (Observer o : seguidores){
            o.actualizar();
        }
    }
}
