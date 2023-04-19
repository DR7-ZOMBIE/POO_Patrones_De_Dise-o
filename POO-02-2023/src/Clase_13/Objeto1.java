package Clase_13;

public class Objeto1 implements Comparable<Objeto1>{

    // Genericidad el comparable es indicando
    // Con que lo vas a comparar, si se coloca
    // genericidad T es que recibe cualquier cosa
    // Para comparar

    //El ejemplo que se hace es comparando dos objetos
    // Del mismo tipo por edad
    private int edad;

    public Objeto1(int edad) {
        this.edad = edad;
    }




    public int getEdad() {
        return edad;
    }

    public static void main(String[] args) {
        Objeto1 o1 = new Objeto1(30);
        Objeto1 o2 = new Objeto1(20);

    }

    @Override
    public int compareTo(Objeto1 o) {
        return 0;
    }
}
