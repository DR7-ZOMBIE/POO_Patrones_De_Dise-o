package Clase_8;

// implemeta la intrefaz y sobrescribi el metodo hacerAmigo()
public class Persona implements Amigable {

    private String nombre;
    private Integer felicidad;
    private Integer cantidadAmigos;

    // constructor no borrar
    public Persona(String nombre) {
        this.nombre = nombre;
        felicidad = 100;
        cantidadAmigos = 0;
    }

    //implementa el metodo aca

    @Override
    public void hacerAmigo(){
        this.felicidad+=10;
        this.cantidadAmigos+=1;
        System.out.println("Hiazo amigos:" + getFelicidad() + getCantidadAmigos());
    }


    //getters no borrar
    public Integer getFelicidad() {
        return felicidad;
    }

    public Integer getCantidadAmigos() {
        return cantidadAmigos;
    }
}
