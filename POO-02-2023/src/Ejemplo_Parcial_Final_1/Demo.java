package Ejemplo_Parcial_Final_1;

import Clase_1.Main;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        ProductFactoryMethodSingleton fabrica = ProductFactoryMethodSingleton.obtenerIntancia();

        Tela razo = (Tela) fabrica.crearProducto("tela");
        razo.setNombre("Razo");
        razo.setColor("blanco");
        razo.setCosto(1250.0);
        System.out.println(razo.precioProductos());

        Tela seda = (Tela) fabrica.crearProducto("tela");
        seda.setNombre("Seda");
        seda.setColor("rosa");
        seda.setCosto(950.0);
        System.out.println(seda.precioProductos());

        Boton grande = (Boton) fabrica.crearProducto("boton");
        grande.setNombre("grande");
        grande.setColor("dorado");
        grande.setCosto(150.0);
        System.out.println(grande.precioProductos());

        Hilo deSeda = (Hilo) fabrica.crearProducto("hilo");
        deSeda.setNombre("Hilo de seda negro");
        deSeda.setColor("negro");
        deSeda.setCosto(200.0);
        System.out.println(deSeda.precioProductos());

        Hilo deSeda2 = (Hilo) fabrica.crearProducto("hilo");
        deSeda2.setNombre("Hilo de seda blanco");
        deSeda2.setColor("blanco");
        deSeda2.setCosto(175.0);
        System.out.println("Hola");
        System.out.println(deSeda2.precioProductos());

        PrendaDeVestirComposite vestido = (PrendaDeVestirComposite) fabrica.crearProducto("prenda");
        vestido.agregarMateriales(razo);
        vestido.agregarMateriales(seda);
        vestido.agregarMateriales(deSeda2);
        vestido.setCostoManoDeObra(7500.0);
        vestido.setNombre("Vestido de Novia");
        vestido.setColor("Arcoiris");
        System.out.println(vestido.mostrarMatyeriales());
        System.out.println(vestido.precioPrendaVestir());

        Boleta b = new Boleta();
        b.agregarProducto(razo);
        b.agregarProducto(grande);
        b.agregarProducto(vestido);
        System.out.println(b.costoTotalProductos());
        System.out.println(b.mostrarProducto());
//        try {
//            b.finalizarCompra();
//            System.out.println(b.isPagada());
//        } catch (Excepcion e) {
//            throw new RuntimeException(e);
//        }


    }

}
