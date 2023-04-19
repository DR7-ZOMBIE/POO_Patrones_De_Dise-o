package Dennis_Patrick_Juilland_Prada;

import java.util.ArrayList;
import java.util.Collections;

public class CombinadaComposite extends Pizza {

    private ArrayList<Pizza> simples = new ArrayList<Pizza>();

    public void agregarPizza(Pizza p) {
        simples.add(p);
    }

    public void eliminarPizza(Pizza p) {
        simples.add(p);
    }


    public String mostratPizza() {
        String texto = "";

        for (Pizza p : simples) {

            texto += p.getNombre() + " " + p.calcularPrecio() + "\n";

        }

        return texto;
    }

    @Override
    public double calcularPrecio() {
        double precioMayor = 0.0;

        for (Pizza p: simples) {
            if (p.calcularPrecio() > precioMayor) {
                precioMayor = p.calcularPrecio();
            }
        }
        return precioMayor;
    }


    @Override
    public String toString() {
        return "nombre:" + " " + this.getNombre() + " " +
                "descripcion:" + " " + this.getDescripcion() + " " +
                "precio Final:" + this.calcularPrecio() + " " + "pesos" + "\n" +
                "-----------------------------------------------" + "\n" +
                mostratPizza();
    }


}
