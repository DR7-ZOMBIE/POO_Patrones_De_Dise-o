package clase_5;

public class usuarioJuego {

    private String nombre;

    private String clave;

    private double puntaje = 0;

    private int nivel = 0;

    public usuarioJuego(String nombre, String clave, double puntaje, int nivel) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = puntaje;
        this.nivel = nivel;
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
        return "usuarioJuego{" +
                "nombre='" + nombre + '\'' +
                ", clave='" + clave + '\'' +
                ", puntaje=" + puntaje +
                ", nivel=" + nivel +
                '}';
    }

    public void aumentarPuntaje(double aumentarPuntaje){
        if (aumentarPuntaje + this.puntaje >= 100 ){
            this.nivel += 1;
            aumentarNivel(this.nivel);
            System.out.println("Se aumento al nivel 1");
        }else if(aumentarPuntaje + this.puntaje >= 200){
            this.nivel += 2;
            aumentarNivel(this.nivel);
            System.out.println("Se auemnto al nivel 2");
        }else{
            System.out.println("No se puede aumentar mas el nivel fin del juego");
        }
    }

    public int aumentarNivel (int nivel) {
        return nivel + this.nivel;
    }

    public double bonus(int valor){
    return this.puntaje + valor;
    }
}
