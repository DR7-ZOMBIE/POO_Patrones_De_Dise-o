package Ejemplo_Final_3;

public class CargaFactoryMethodSingleton {

    private static CargaFactoryMethodSingleton instancia;

    private CargaFactoryMethodSingleton(){ }

    public static CargaFactoryMethodSingleton obtenerInstancia(){
        if (CargaFactoryMethodSingleton.instancia == null) {
            CargaFactoryMethodSingleton.instancia = new CargaFactoryMethodSingleton();

        }

        return CargaFactoryMethodSingleton.instancia;
    }

    public Carga crearCarga(String nombre){

        switch (nombre.toUpperCase()){
            case "SIMPLE":
                return new Simple();
            case "CONTENEDOR":
                return new ContenedorCompotion();
        }

        return null;
    }


}
