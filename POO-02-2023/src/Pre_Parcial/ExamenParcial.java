package Pre_Parcial;

public class ExamenParcial extends Examen {

    private int numeroUnidad;

    private int numeroIntentos;
    public ExamenParcial(String titulo, String enunciado, double nota, Estudiante estudiante, int numeroUnidad, int numeroIntentos) {
        super(titulo, enunciado, nota, estudiante);
        this.numeroUnidad = numeroUnidad;
        this.numeroIntentos = numeroIntentos;
    }

    public int getNumeroUnidad() {
        return numeroUnidad;
    }

    public void setNumeroUnidad(int numeroUnidad) {
        this.numeroUnidad = numeroUnidad;
    }

    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }

    @Override
    public boolean isAprobado(int nota) {
        if (nota >= 4) return true;
        return false;
    }

    public boolean isRecuperado(){
        if (this.numeroUnidad <= 3 &&  this.numeroIntentos <= 3) {
        return true;
        }else if(this.numeroUnidad >= 3 && this.numeroIntentos <= 2){
            return true;
        }

        return false;
    }


}
