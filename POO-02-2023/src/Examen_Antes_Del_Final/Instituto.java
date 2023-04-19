package Examen_Antes_Del_Final;

import java.util.ArrayList;

public class Instituto {

    private ArrayList<OfertaAcademica> ofertas = new ArrayList<OfertaAcademica>();

    public void agregarCursos(OfertaAcademica o){
        ofertas.add(o);
    }

    public void eliminarCursos(OfertaAcademica o){
        ofertas.remove(o);
    }

    public String mostrarCursos(){
        String result = "";

        for (OfertaAcademica o: ofertas) {
            result += o.getNombre() + " " + o.calcularPrecio();
        }

        return result;

    }
}
