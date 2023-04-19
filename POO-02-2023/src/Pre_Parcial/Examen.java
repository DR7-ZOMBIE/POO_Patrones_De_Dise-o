package Pre_Parcial;

public abstract class Examen {

    private String titulo;

    private String enunciado;

    private double nota;

    private Estudiante estudiante;


    public Examen(String titulo, String enunciado, double nota, Estudiante estudiante) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
        this.estudiante = estudiante;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public abstract boolean isAprobado(int nota);
}
