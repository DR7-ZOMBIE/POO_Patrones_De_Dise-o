package Ejempolo_Final_2;

import Ejemplo_Parcial_Final_1.Excepcion;

public class Demo {

    public static void main(String[] args) {

        ProductFactoryMethodSingleton fabrica =  ProductFactoryMethodSingleton.obtenerInstancia();


        Tela razo = (Tela) fabrica.crearProductos("Tela");
        razo.setNombre("Razo");
        razo.setColor("blanco");
        razo.setCosto(1250.0);
        System.out.println(razo.calcularCostoProductos());

        Tela seda = (Tela) fabrica.crearProductos("Tela");
        seda.setNombre("Seda");
        seda.setColor("rosa");
        seda.setCosto(950.0);
        System.out.println(seda.calcularCostoProductos());

        Boton boton = (Boton) fabrica.crearProductos("Boton");
        boton.setNombre("Boton grande");
        boton.setColor("dorado");
        boton.setCosto(150.0);
        System.out.println(boton.calcularCostoProductos());

        Hilo hiloSeda = (Hilo) fabrica.crearProductos("Hilo");
        hiloSeda.setNombre("Hilo de seda");
        hiloSeda.setColor("negro");
        hiloSeda.setCosto(200.0);
        System.out.println(hiloSeda.calcularCostoProductos());

        Hilo hiloSeda2 = (Hilo) fabrica.crearProductos("Hilo");
        hiloSeda2.setNombre("Hilo de seda");
        hiloSeda2.setColor("blanco");
        hiloSeda2.setCosto(175.0);
        System.out.println(hiloSeda2.calcularCostoProductos());

        PrendaDeVestirComposite vestido = (PrendaDeVestirComposite) fabrica.crearProductos("Prenda");
        vestido.agregarMaterial(razo);
        vestido.agregarMaterial(seda);
        vestido.agregarMaterial(hiloSeda2);
        vestido.setCostoManoDeObra(7500.0);
        vestido.setNombre("Hermoso");
        vestido.setColor("Arcoiris");
        System.out.println(vestido.mostrarMateriales());
        System.out.println(vestido.precioMateriales());

        System.out.println("--------------------------------------------------------------------------------");

        Boleta b = new Boleta();
        b.agregarProducto(razo);
        b.agregarProducto(boton);
        b.agregarProducto(vestido);
        System.out.println(b.costoTotalProductos());
        System.out.println(b.mostrarProductos());

        try {
            System.out.println( b.verificarContieneUnProducto());
        } catch (Excepcion e) {
            throw new RuntimeException(e);
        }


    }
}
