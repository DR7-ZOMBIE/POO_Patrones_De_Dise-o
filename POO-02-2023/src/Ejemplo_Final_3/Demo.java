package Ejemplo_Final_3;

public class Demo {

    public static void main(String[] args) {

        CargaFactoryMethodSingleton carga = CargaFactoryMethodSingleton.obtenerInstancia();

        Simple TV = (Simple) carga.crearCarga("SIMPLE");
        TV.setNombre("TV 32 LCD");
        TV.setPeso(3);
        TV.setRefrigeration(false);
        System.out.println(TV.calcularPesoCarga());

        Simple caja = (Simple) carga.crearCarga("SIMPLE");
        caja.setNombre("Caja de medicamentos");
        caja.setPeso(2);
        caja.setRefrigeration(true);
        System.out.println(caja.calcularPesoCarga());

        ContenedorCompotion contenedor = (ContenedorCompotion) carga.crearCarga("CONTENEDOR");
        contenedor.setNombre("Contenedor");
        contenedor.setPeso(100);
        contenedor.agregarCarga(TV);
        contenedor.agregarCarga(caja);
        System.out.println(contenedor.calcularPesoCarga());
        System.out.println(contenedor.mostrarCargas());

        Barco b = new Barco();
        b.agregarCarga(TV);
        b.agregarCarga(caja);
        b.agregarCarga(contenedor);
        System.out.println(b.calcularPesoCarga());
        System.out.println(b.mostrarCargas());


    }
}
