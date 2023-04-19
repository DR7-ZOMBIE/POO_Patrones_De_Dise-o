package Ejemplo_Parcial_Final_1;

public class ProductFactoryMethodSingleton {

    private static ProductFactoryMethodSingleton instnacia;

    private ProductFactoryMethodSingleton(){

    }

    public static ProductFactoryMethodSingleton obtenerIntancia(){
        if (ProductFactoryMethodSingleton.instnacia == null)
            ProductFactoryMethodSingleton.instnacia = new ProductFactoryMethodSingleton();

        return ProductFactoryMethodSingleton.instnacia;
    }

    public Producto crearProducto(String nombre){

        switch (nombre.toUpperCase()){
            case "HILO":
            return new Hilo();
                 case "BOTON":
                    return new Boton();
                        case "TELA":
                            return new Tela();
                                case "PRENDA":
                                     return new PrendaDeVestirComposite();
        }

       return null;
    }
}
