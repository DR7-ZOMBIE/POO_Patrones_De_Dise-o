package Pre_Parcial;

public class ExamenFinal extends Examen implements Comparable<ExamenFinal> {

    private double  notaOral;
    private String descripcion;

    private int numeroIntentos;

    public ExamenFinal(String titulo, String enunciado, double nota, Estudiante estudiante) {
        super(titulo, enunciado, nota, estudiante);
    }

    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }

    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean isAprobado(int nota) {
        if (nota >= 4 && this.getNotaOral() >=4 ) return true;
        return false;
    }

    @Override
    public int compareTo(ExamenFinal o) {
        double promedioNotasThis = (this.notaOral + this.getNota())/2; // Notas del primer onjeto
        double promedioNotasParam = (o.getNotaOral() + o.getNota())/2; // Notas del objeto del parametro

        if (promedioNotasThis > promedioNotasParam) {
            return 1;
        }else if(promedioNotasThis < promedioNotasParam){
            return -1;
        }
        return 0;
    }

//    public boolean isRecuperado(){
//
//    }
}
