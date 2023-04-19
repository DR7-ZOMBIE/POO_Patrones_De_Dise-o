package Clase_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Empresa {

    private LinkedList<LinkedList<Reserva>> reservas = new LinkedList<>();

    public static void main(String[] args) {
        Persona p = new Persona("Carlos", "123",true);
        Persona p2 = new Persona("Carlos", "123",true);
        Reserva r = new Reserva("222",new Recorrido(), new Boleto(50),new ArrayList<Persona>(Arrays.asList(p,p2)));
        Reserva r2 = new Reserva("222",new Recorrido(), new Boleto(50),new ArrayList<Persona>(Arrays.asList(p,p2)));
        Empresa e = new Empresa();
        LinkedList<Reserva> reservas = e.agregarReserva(new LinkedList<Reserva>(Arrays.asList(r,r2)));
        System.out.println(e.recaudacionTotal(reservas));
    }

    public LinkedList<Reserva> agregarReserva(LinkedList<Reserva> r){
        reservas.add(r);
        return r;
    }

    public double recaudacionTotal(LinkedList<Reserva> reservas){
        int acum = 0;
        for (Reserva reserva:reservas) {
            acum += reserva.precioReserva(reserva.cantidadPersonas(), reserva.getBoleto()
                    .getPrecio());
        }

        return acum;
    }



}
