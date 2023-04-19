package Clase_1;

public class Mascota {

    private String nombre;
    private int edad;
    private int consumoAlimento;
    private String preguntas;


    public Mascota(String nombre, int edad, int consumoAlimento, String preguntas) {
        this.nombre = nombre;
        this.edad = edad;
        this.consumoAlimento = consumoAlimento;
        this.preguntas = preguntas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getConsumoAlimento() {
        return consumoAlimento;
    }

    public String getPreguntas() {
        return preguntas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setConsumoAlimento(int consumoAlimento) {
        this.consumoAlimento = consumoAlimento;
    }

    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }
}
