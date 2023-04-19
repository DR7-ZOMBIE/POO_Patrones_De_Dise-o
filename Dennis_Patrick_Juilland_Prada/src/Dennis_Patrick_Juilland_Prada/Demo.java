package Dennis_Patrick_Juilland_Prada;

public class Demo {

    public static void main(String[] args) {


        PizzaFactoryMethodSingleton pizzeria = PizzaFactoryMethodSingleton.obtenerInstancia();

        Simple mozzarella = (Simple) pizzeria.crearPizza("SIMPLE");
        mozzarella.setNombre("Pizza de mozzarella");
        mozzarella.setPrecioBase(700.0);
        mozzarella.setPromocion(true);
//        System.out.println(mozzarella.calcularPrecio());

        Simple especial = (Simple) pizzeria.crearPizza("SIMPLE");
        especial.setNombre("Pizza especial");
        especial.setPrecioBase(850.0);
        especial.setPromocion(false);
//        System.out.println(especial.calcularPrecio());

        Simple anana = (Simple) pizzeria.crearPizza("SIMPLE");
        anana.setNombre("Pizza de anana");
        anana.setPrecioBase(950.0);
        anana.setPromocion(false);
//        System.out.println(anana.calcularPrecio());

        CombinadaComposite combinada = (CombinadaComposite) pizzeria.crearPizza("COMBINADA");
        combinada.setNombre("Pizza loca");
        combinada.setDescripcion("Es mitad especial y mitad de anana");
        combinada.agregarPizza(mozzarella);
        combinada.agregarPizza(especial);
        combinada.agregarPizza(anana);
//        System.out.println(combinada.calcularPrecio());
//        System.out.println(combinada.mostratPizza());
        System.out.println(combinada.toString());

        Pizzeria p  = new Pizzeria();
        p.agregarPizza(mozzarella);
        p.agregarPizza(especial);
        p.agregarPizza(anana);
        p.agregarPizza(combinada);
        System.out.println(p.mostratPizza());











    }

}
