package Ejemplo_Final_3;

import java.util.ArrayList;

public class Barco {

    private ArrayList<Carga> cargas = new ArrayList<Carga>();

    public String mostrarCargas(){
        String texto = "";

        for (Carga c:cargas) {
            texto += c.getNombre() + " " + c.getPeso() + "\n";
        }

        return texto;
    }

    public void agregarCarga(Carga c){
        cargas.add(c);
    }

    public void eliminarCarga(Carga c){
        cargas.remove(c);
    }

    public double calcularPesoCarga() {
        double acum = 0.0;

        for (Carga c: cargas) {
            acum += c.getPeso();
        }

        return acum;
    }
}
