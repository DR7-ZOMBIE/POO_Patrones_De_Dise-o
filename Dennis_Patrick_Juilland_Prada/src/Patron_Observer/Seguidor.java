package Patron_Observer;

public class Seguidor implements Observer{

    private String nombre;

    private String apellido;

    private int cantidadNotificaciones = 0;

    private Publicador p;
    @Override
    public void actualizar() {
        System.out.println(this.nombre + " " + "Se ha actualizado la foto" );
        this.cantidadNotificaciones++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCantidadNotificaciones() {
        return cantidadNotificaciones;
    }

    public void setCantidadNotificaciones(int cantidadNotificaciones) {
        this.cantidadNotificaciones = cantidadNotificaciones;
    }
}
