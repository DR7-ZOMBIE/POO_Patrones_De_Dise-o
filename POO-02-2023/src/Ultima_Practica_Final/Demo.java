package Ultima_Practica_Final;

public class Demo {

    public static void main(String[] args) {
        UnidadFactoryMethodSingleton unidades = UnidadFactoryMethodSingleton.getInstance();

        Simple mantenimiento = (Simple) unidades.crearUnidad("SIMPLE");
        mantenimiento.setNombre("Mantenimiento");
        mantenimiento.setCantidadPersonas(4);
        mantenimiento.setMontoPersona(12000.0);
        System.out.println(mantenimiento.calcularMonto());

        Simple limpieza = (Simple) unidades.crearUnidad("SIMPLE");
        limpieza.setNombre("Limpieza");
        limpieza.setCantidadPersonas(24);
        limpieza.setMontoPersona(10000.0);
        System.out.println(limpieza.calcularMonto());

        CombinadaComposite combinada = (CombinadaComposite) unidades.crearUnidad("COMBINADA");
        combinada.agregarSimple(mantenimiento);
        combinada.agregarSimple(limpieza);
        combinada.setNombre("Servicios Generales");
        combinada.setCoeficienteGlobal(3);
//        System.out.println(combinada.mostrarCombinada());
        System.out.println(combinada.toString());



    }




}
