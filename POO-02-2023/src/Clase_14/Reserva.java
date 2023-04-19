package Clase_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Reserva implements Comparator<Reserva>, Comparable<Reserva> {

    private String codigo;

    private Recorrido recorrido;
    private ArrayList<Persona> Persona = new ArrayList<Persona>();

    private Boleto boleto;

    public Reserva(String number, Recorrido recorrido,Boleto boleto, ArrayList<Persona> personas) {
        this.codigo = number;
        this.recorrido = recorrido;
        this.Persona = personas;
        this.boleto = boleto;
    }

    public static void main(String[] args) {
        Persona p = new Persona("Carlos", "123",true);
        Persona p2 = new Persona("Carlos", "123",true);
        Reserva r = new Reserva();
        Recorrido recorrido = new Recorrido();
        r.agregarPersonas(p);
        r.agregarPersonas(p2);
        System.out.println(r.cantidadPersonas());
        Boleto b = new Boleto(50);
        r.precioReserva(r.cantidadPersonas(), b.getPrecio());
        System.out.println(r.precioReserva(r.cantidadPersonas(), b.getPrecio()));
        Estacion e = new Estacion("Buenos Aires", "Bragado");
        r.descuentoPrecioReserva(r.precioReserva(r.cantidadPersonas(), b.getPrecio()), e);
        System.out.println(r.descuentoPrecioReserva(r.precioReserva(r.cantidadPersonas(), b.getPrecio()), e));
        r.verificarSubioBajoEstacion(new ArrayList<Persona>(Arrays.asList(p,p2)),e);
        System.out.println( r.verificarSubioBajoEstacion(new ArrayList<Persona>(Arrays.asList(p,p2)),e));

    }

    public Reserva(String codigo, Recorrido recorrido, ArrayList<Persona> persona, Boleto boleto) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        Persona = persona;
        this.boleto = boleto;
    }

    public Reserva() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    public ArrayList<Clase_14.Persona> getPersona() {
        return Persona;
    }

    public void setPersona(ArrayList<Clase_14.Persona> persona) {
        Persona = persona;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }

    @Override
    public int compareTo(Reserva o) {
        return 0;
    }

    @Override
    public int compare(Reserva o1, Reserva o2) {
        return 0;
    }

    public int cantidadPersonas() {
        int count = 0;
        for (Persona i : Persona) {
//            System.out.println(i);
            count++;
        }
        return count;
    }

    public void agregarPersonas(Persona p) {
        Persona.add(p);
    }

    public double precioReserva(int cantidadPersonas, double precioBoleto) {
        if (precioBoleto == 50) return cantidadPersonas * precioBoleto;
        else throw new RuntimeException("El precio del boleto debe ser 50");
    }

    public double descuentoPrecioReserva(double precioReserva, Estacion e) {
//        recorrido.agregarEstacion(e);
        if (e.getOrigen().compareTo("Buenos Aires") == 0 && e.getDestino().compareTo("Bragado") == 0
                || e.getOrigen().compareTo("Bragado") == 0 && e.getDestino().compareTo("Buenos Aires") == 0)
            return precioReserva * 0.20;
        else throw new RuntimeException("No aplica descuento de ninguna forma");

    }

    public int verificarSubioBajoEstacion(ArrayList<Persona> p, Estacion e){
        int count = 0;
        for (int i = 0; i < p.size() ; i++) {
            if (p.get(i).isEstacion() == true && e.getOrigen() != ""
            && e.getDestino() != "") count++;
        }

        for (int i = 0; i < count; i++) {
            return count;
        }

        throw new RuntimeException("Nadie subio al tren");
    }





}
