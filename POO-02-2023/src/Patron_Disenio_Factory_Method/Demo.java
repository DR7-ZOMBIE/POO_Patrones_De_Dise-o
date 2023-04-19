package Patron_Disenio_Factory_Method;

public class Demo {

    FiguraFactoryMethod fabrica = new FiguraFactoryMethod();

    Cuadrado cuadrado = (Cuadrado) fabrica.creaFigura2D("Cuadrado");
    Equilatero triangulo = (Equilatero) fabrica.creaFigura2D("Equilatero");

    Rectangulo rectangulo = (Rectangulo) fabrica.creaFigura2D("Rectangulo");



}
