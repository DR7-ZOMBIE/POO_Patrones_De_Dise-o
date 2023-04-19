package Ejempolo_Final_2;

import java.util.ArrayList;

public class PrendaDeVestirComposite extends Producto{

    private ArrayList<Producto> materiales = new ArrayList<Producto>();

    private double costoManoDeObra;

    public String mostrarMateriales(){

        String texto = "";

        for (Producto p: materiales) {
            texto += p.getNombre() + " " + p.getColor();
        }
        return texto;
    }

    public double precioMateriales(){

        double acum = 0.0;

        for (Producto p: materiales) {
            acum += p.calcularCostoProductos();
        }

        return acum;
    }

    public double descuentoPrecioTotalMateriales(double descuento){
        return precioMateriales() - (precioMateriales()*(descuento/100));
    }

    public void agregarMaterial(Producto p){
        materiales.add(p);
    }

    public void eliminarMaterial(Producto p){
        materiales.add(p);
    }

    public ArrayList<Producto> getMateriales() {
        return materiales;
    }

    public void setMateriales(ArrayList<Producto> materiales) {
        this.materiales = materiales;
    }

    public double getCostoManoDeObra() {
        return costoManoDeObra;
    }

    public void setCostoManoDeObra(double costoManoDeObra) {
        this.costoManoDeObra = costoManoDeObra;
    }

    @Override
    public String toString() {
        return "PrendaDeVestirComposite{" +
                "materiales=" + materiales +
                ", costoManoDeObra=" + costoManoDeObra +
                '}';
    }
}
