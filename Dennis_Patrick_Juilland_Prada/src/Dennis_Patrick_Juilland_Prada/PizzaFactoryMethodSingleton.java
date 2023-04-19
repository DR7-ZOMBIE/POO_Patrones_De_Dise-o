package Dennis_Patrick_Juilland_Prada;

public class PizzaFactoryMethodSingleton {

    private static PizzaFactoryMethodSingleton instancia;

    private PizzaFactoryMethodSingleton() { }


    public static PizzaFactoryMethodSingleton obtenerInstancia(){
        if(PizzaFactoryMethodSingleton.instancia ==null){
            PizzaFactoryMethodSingleton.instancia = new PizzaFactoryMethodSingleton();
        }

        return PizzaFactoryMethodSingleton.instancia;
    }

    public Pizza crearPizza(String nombre){

        switch (nombre.toUpperCase()) {

            case "SIMPLE":
                return new Simple();
                case "COMBINADA":
                    return new CombinadaComposite();

        }

        return null;
    }
}
