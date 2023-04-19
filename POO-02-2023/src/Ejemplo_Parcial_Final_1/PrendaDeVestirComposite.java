package Ejemplo_Parcial_Final_1;

import java.util.ArrayList;

public class PrendaDeVestirComposite extends Producto{

    private ArrayList<Producto> materiales = new ArrayList<Producto>();

    private double costoManoDeObra;

    public void agregarMateriales (Producto producto){
        materiales.add(producto);
    }

    public void eliminarMateriales( Producto producto){
        materiales.remove(producto);
    }

    public String mostrarMatyeriales(){

       String texto = "";

        for (int i = 0; i < materiales.size() ; i++) {
            texto += (materiales.get(i).getNombre() + materiales.get(i).getColor());
        }

        return texto;
    }

    public double precioPrendaVestir(){
        double acum = 0.0;
        for (Producto p: materiales) {
            acum += p.precioProductos();
        }

        return acum + this.costoManoDeObra;
    }

    public double descuentoTotalPrecio( double descuento){
        return precioPrendaVestir() - precioPrendaVestir()*(descuento/100);

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
