package Ejempolo_Final_2;

public class ProductFactoryMethodSingleton {

    private static ProductFactoryMethodSingleton instancia;

    private ProductFactoryMethodSingleton(){ }

    public static ProductFactoryMethodSingleton obtenerInstancia(){
        if (ProductFactoryMethodSingleton.instancia == null){
            ProductFactoryMethodSingleton.instancia =  new ProductFactoryMethodSingleton();
        }

        return ProductFactoryMethodSingleton.instancia;
    }

    public Producto crearProductos(String nombre){

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
