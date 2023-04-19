package Ejemplo_Parcial_Final_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class Boleta {

    private LinkedList<Producto> productos = new LinkedList<Producto>();

    private LocalDate fecha;

    private boolean isPagada = true; // true tiene producto

    public void agregarProducto (Producto producto){
        productos.add(producto);
    }

    public void eliminarProducto( Producto producto){
        productos.remove(producto);
    }

    public String mostrarProducto(){

        String texto = "";

        for (int i = 0; i < productos.size() ; i++) {
            texto += (productos.get(i).getNombre() + productos.get(i).getColor());
        }

        return texto;
    }

    public double costoTotalProductos(){
        double acum = 0.0;

        for (Producto p: productos) {
            acum+= p.precioProductos();
        }

        return acum;
    }

    public void finalizarCompra() throws Excepcion {
        if (this.productos != null & this.productos.size() > 0) {
            this.fecha = LocalDate.now();
            this.isPagada = true;
        } else {
            this.isPagada = !isPagada;
            throw new Excepcion("No hay productos");
        }
    }


    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isPagada() {
        return isPagada;
    }

    public void setPagada(boolean pagada) {
        isPagada = pagada;
    }
}
