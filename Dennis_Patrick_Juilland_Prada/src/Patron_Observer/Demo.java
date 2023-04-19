package Patron_Observer;

public class Demo {

    public static void main(String[] args) {

        Seguidor natalia = new Seguidor();
        natalia.setNombre("Natalia");
        System.out.println(natalia.getCantidadNotificaciones());

        Seguidor pablo = new Seguidor();
        pablo.setNombre("Pablo");

        Seguidor lorena = new Seguidor();
        lorena.setNombre("lorena");

        Publicador Juan = new Publicador();
        Juan.setNombre("Juan");
        Juan.agregar(natalia);
        Juan.agregar(pablo);
        Juan.agregar(lorena);
        Juan.notificar();
        Juan.subirFoto();


        System.out.println(natalia.getCantidadNotificaciones());

    }
}
