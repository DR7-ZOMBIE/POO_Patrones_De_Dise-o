package Examen_Antes_Del_Final;

public class Demo {

    public static void main(String[] args) {

            OfertaFactoryMethodSingleton instituto = OfertaFactoryMethodSingleton.obtenerInstancia();

            Curso frontend = (Curso) instituto.crearOferta("CURSO");
            frontend.setNombre("Front End");
            frontend.setCargaMensual(20);
            frontend.setCantidadMeses(2);
            frontend.setValorHorADouble(900.0);
            System.out.println(frontend.calcularPrecio());

            Curso backend = (Curso) instituto.crearOferta("CURSO");
            backend.setNombre("Front End");
            backend.setCargaMensual(16);
            backend.setCantidadMeses(2);
            backend.setValorHorADouble(1000.0);
            System.out.println(backend.calcularPrecio());

            CarreraComposite carrera = (CarreraComposite) instituto.crearOferta("CARRERA");
            carrera.agregarCursos(frontend);
            carrera.agregarCursos(backend);
            carrera.setPorcentajeBonificacion(20);
            System.out.println(carrera.calcularPrecio());






    }

}
