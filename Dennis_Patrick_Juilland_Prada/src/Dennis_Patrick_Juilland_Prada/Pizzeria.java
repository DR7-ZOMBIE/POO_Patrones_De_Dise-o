package Dennis_Patrick_Juilland_Prada;

import java.util.ArrayList;

public class Pizzeria {

    private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

    public void agregarPizza(Pizza p) {
        pizzas.add(p);
    }

    public void eliminarPizza(Pizza p) {
        pizzas.add(p);
    }


    public String mostratPizza() {
        String texto = "";

        for (Pizza p : pizzas) {

            texto += p.getNombre() + " " + p.calcularPrecio() + "\n" ;

        }

        return texto;
    }
}
