package Patron_De_Disenio_Composite;

import java.util.ArrayList;

public class FiguraComposite implements Grafico{

    private ArrayList<Grafico> graficos = new ArrayList<Grafico>();

    public void agregarGrafico(Grafico grafico){
        graficos.add(grafico);
    }

    public void quitarGrafico(Grafico grafico){
        graficos.remove(grafico);
    }

    @Override
    public void graficar() {

    }

    @Override
    public void colorear(String color) {

    }
}
