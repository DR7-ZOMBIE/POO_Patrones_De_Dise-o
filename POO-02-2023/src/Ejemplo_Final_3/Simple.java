package Ejemplo_Final_3;

public class Simple extends Carga{

    private boolean isRefrigeration = false; // No tiene refrigeracion

    private final double porcentajeRefrigerado = 0.10;
    @Override
    public double calcularPesoCarga() {
        double aux = 0;
        if (isRefrigeration == true ){
            aux = this.getPeso() + (this.getPeso() * porcentajeRefrigerado);
            this.setPeso(aux);
            return aux;
        }else{
            return this.getPeso();
        }
    }

    public boolean isRefrigeration() {
        return isRefrigeration;
    }

    public void setRefrigeration(boolean refrigeration) {
        isRefrigeration = refrigeration;
    }

    public double getPorcentajeRefrigerado() {
        return porcentajeRefrigerado;
    }
}
