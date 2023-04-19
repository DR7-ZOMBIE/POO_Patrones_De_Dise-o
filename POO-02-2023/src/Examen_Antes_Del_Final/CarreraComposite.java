package Examen_Antes_Del_Final;

import java.util.ArrayList;

public class CarreraComposite extends OfertaAcademica{

        private ArrayList<OfertaAcademica> cursos = new ArrayList<OfertaAcademica>();
        private double porcentajeBonificacion;


        public void agregarCursos(OfertaAcademica o){
                cursos.add(o);
        }

        public void eliminarCursos(OfertaAcademica o){
                cursos.remove(o);
        }

        public String mostrarCursos(){
                String result = "";

                for (OfertaAcademica o: cursos) {
                        result += o.getNombre() + " " + o.calcularPrecio();
                }

                return result;

        }
        @Override
        public double calcularPrecio() {
                double acum = 0;
                for (OfertaAcademica o:cursos) {
                        acum += o.calcularPrecio();
                }

                if (porcentajeBonificacion > 0){
                        return acum - (acum * (this.porcentajeBonificacion/100));
                }

                return acum;
        }

        public ArrayList<OfertaAcademica> getCursos() {
                return cursos;
        }

        public void setCursos(ArrayList<OfertaAcademica> cursos) {
                this.cursos = cursos;
        }

        public double getPorcentajeBonificacion() {
                return porcentajeBonificacion;
        }

        public void setPorcentajeBonificacion(double porcentajeBonificacion) {
                this.porcentajeBonificacion = porcentajeBonificacion;
        }
}
