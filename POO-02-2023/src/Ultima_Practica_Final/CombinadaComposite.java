package Ultima_Practica_Final;

import java.util.ArrayList;

public class CombinadaComposite extends Unidad{

    private ArrayList<Unidad> simples = new ArrayList<Unidad>();

    private double montoMaterial;

    private double coeficienteGlobal;

    public void agregarSimple(Unidad u){
        simples.add(u);
    }

    public void eliminarSimple(Unidad u){
        simples.remove(u);
    }

    public String mostrarCombinada(){
        String text = "";

        for (Unidad u: simples) {
            text += u.getNombre() + " " + u.toString() +" " + u.calcularMonto() +"\n";
        }

        return text;
    }


    @Override
    public double calcularMonto() {
        double acum = 0.0;

        for (Unidad u: simples) {
            acum += u.calcularMonto();
        }
        return acum*coeficienteGlobal;
    }

    @Override
    public String toString() {
        return "nombre:" + this.getNombre()+
                "Factor Multiplicador:" + this.getCoeficienteGlobal()+"\n"+
                "-----------------------------------------------------"+"\n"+
                "Contiene:" + mostrarCombinada();

    }

    public ArrayList<Unidad> getSimples() {
        return simples;
    }

    public void setSimples(ArrayList<Unidad> simples) {
        this.simples = simples;
    }

    public double getMontoMaterial() {
        return montoMaterial;
    }

    public void setMontoMaterial(double montoMaterial) {
        this.montoMaterial = montoMaterial;
    }

    public double getCoeficienteGlobal() {
        return coeficienteGlobal;
    }

    public void setCoeficienteGlobal(double coeficienteGlobal) {
        this.coeficienteGlobal = coeficienteGlobal;
    }
}
