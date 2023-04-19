package clase_5;

public class Usuario {

    private String nombre;

    private String clave;

    private double puntaje;

    private int nivel;


    public Usuario(String nombre, String clave, double puntaje, int nivel) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = puntaje;
        this.nivel = nivel;
    }

    public Usuario() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", clave='" + clave + '\'' +
                ", puntaje=" + puntaje +
                ", nivel=" + nivel +
                '}';
    }

    public double aumentarPuntaje(double valorAumentar){
        double acum = valorAumentar + this.puntaje;
        setPuntaje(acum);
        return getPuntaje();
    }

    public double subirNivel(){
        double acum = 0;
        if (this.puntaje > 100) {
            acum = 1+ this.nivel;
        }else if(this.puntaje > 200){
            acum = 2+ this.nivel;
        }else {
            System.out.println("No se puede aumentar el puntaje");
        }

        setPuntaje(acum);
        return getPuntaje();
    }

    public double bonus(int aumentar){
        return this.puntaje + aumentar;
    }
}
