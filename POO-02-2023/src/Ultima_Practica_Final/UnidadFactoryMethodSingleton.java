package Ultima_Practica_Final;

public class UnidadFactoryMethodSingleton {

    private static UnidadFactoryMethodSingleton instancia;

    private UnidadFactoryMethodSingleton(){}

    public static UnidadFactoryMethodSingleton getInstance(){
        if (instancia == null) {
            UnidadFactoryMethodSingleton.instancia = new UnidadFactoryMethodSingleton();
        }

        return UnidadFactoryMethodSingleton.instancia;
    }

    public Unidad crearUnidad(String nombre) {

        switch (nombre.toUpperCase()) {
            case "SIMPLE":
                return new Simple();
            case "COMBINADA":
                return new CombinadaComposite();
        }

        return null;
    }



}
