package Examen_Antes_Del_Final;

public class OfertaFactoryMethodSingleton {

    private static OfertaFactoryMethodSingleton instancia;

    private OfertaFactoryMethodSingleton(){}

    public static OfertaFactoryMethodSingleton obtenerInstancia(){
        if (OfertaFactoryMethodSingleton.instancia == null){
            OfertaFactoryMethodSingleton.instancia = new OfertaFactoryMethodSingleton();
        }

        return OfertaFactoryMethodSingleton.instancia;
    }

    public OfertaAcademica crearOferta(String nombre){
        switch (nombre.toUpperCase()){
            case "CURSO":
                return new Curso();
                case  "CARRERA":
                    return new CarreraComposite();
        }

        return null;
    }
}
