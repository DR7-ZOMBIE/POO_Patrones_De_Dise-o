package Patron_Disenio_Factory_Method;

public class FiguraFactoryMethod {

    public Figura2D creaFigura2D(String nombre){
        // Los constructores deben ser vacios
        switch (nombre){
            case "Cuadrado":
            return new Cuadrado();
            case "Equilatero":
                return new Cuadrado();
            case "Rectangulo":
                return new Cuadrado();
        }
        return null;
    }
}
