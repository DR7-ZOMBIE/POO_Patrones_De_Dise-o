package Ultima_Practica_Final;

import java.util.ArrayList;

public class Presupuesto {

    private ArrayList<Unidad> unidades = new ArrayList<Unidad>();

    public void agregarSimple(Unidad u){
        unidades.add(u);
    }

    public void eliminarSimple(Unidad u){
        unidades.remove(u);

    }

    public String mostrarCombinada(){
        String text = "";

        for (Unidad u: unidades) {
            text += u.getNombre() + " " + u.toString();
        }

        return text;
    }

    public ArrayList<Unidad> getUnidades() {
        return unidades;
    }

    public void setUnidades(ArrayList<Unidad> unidades) {
        this.unidades = unidades;
    }
}
