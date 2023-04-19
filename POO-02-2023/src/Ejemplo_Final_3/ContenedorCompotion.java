package Ejemplo_Final_3;

import java.util.ArrayList;

public class ContenedorCompotion extends Carga{

    private ArrayList<Carga> cargas = new ArrayList<Carga>();

    public String mostrarCargas(){
        String texto = "";

        for (Carga c:cargas) {
            texto += c.getNombre() + " " + c.getPeso()+ "\n";
        }

        return texto;
    }

    public void agregarCarga(Carga c){
        cargas.add(c);
    }

    public void eliminarCarga(Carga c){
        cargas.remove(c);
    }

    @Override
    public double calcularPesoCarga() {
        double acum = 0;

        for (Carga c: cargas) {
             acum += c.getPeso();
        }
        System.out.println(acum);
        return acum + this.getPeso();
    }


}
