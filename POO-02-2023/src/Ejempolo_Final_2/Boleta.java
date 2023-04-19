package Ejempolo_Final_2;

import Ejemplo_Parcial_Final_1.Excepcion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class Boleta {

    private ArrayList<Producto> productos = new ArrayList<Producto>();

    private LocalDate fecha;

    private boolean isPagada = false; // Falso es que no se ha pagado

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public void eliminarProdcuto(Producto p){
        productos.add(p);
    }

    public String mostrarProductos(){

        String texto = "";

        for (int i = 0; i < productos.size() ; i++) {
            texto+= productos.get(i).getNombre() + " " + productos.get(i).getColor();
        }
        return texto;
    }

    public double costoTotalProductos(){
        double acum = 0.0;

        for (Producto p: productos) {
            acum += p.calcularCostoProductos();
        }

        return acum;
    }

    public boolean verificarContieneUnProducto() throws Excepcion {
        if (this.productos != null && this.productos.size() > 0) {
            this.fecha = LocalDate.now();
            this.isPagada = true;
            return true;
        }else{ throw new Excepcion("No hay materiales para el vestido");
        }
    }
}
