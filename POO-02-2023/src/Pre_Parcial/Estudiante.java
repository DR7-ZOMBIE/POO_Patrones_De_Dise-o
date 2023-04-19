package Pre_Parcial;

public class Estudiante {

    private String nombre;

    private String apellido;

    private String legajo;

    private Examen[] examenes;

    public Estudiante(String nombre, String apellido, String legajo, Examen[] examenes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.examenes = examenes;
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

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public Examen[] getExamenes() {
        return examenes;
    }

    public void setExamenes(Examen[] examenes) {
        this.examenes = examenes;
    }
}
