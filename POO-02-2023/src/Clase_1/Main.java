package Clase_1;

import java.util.Arrays;

public class Main {

    public static Mascota[] mascotas = new Mascota[0];
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        String saludo = "Hola Mundo";
        int entero = 154;
        double v = 1.25;
        float f = 1.25f;
        boolean esMiercoles = true;
        System.out.println(saludo);

        int a = 5;
        int b = 2;
        System.out.println(a+b);

        Main m = new Main();
        m.agregarMascota("Manchitas",2,1,"Como se hace el ladrido");
        System.out.println(mascotas[0].getNombre());


        System.out.println( m.calcularMargenGanacia(150,100));
    }

    public void agregarMascota(String nombre, int edad, int consumoAlimento, String preguntas ){
        mascotas = Arrays.copyOf(mascotas,mascotas.length+1);
        mascotas[mascotas.length-1] = new Mascota(nombre, edad, consumoAlimento, preguntas);
    }

    public int calcularMargenGanacia (int valorCompra, int valorRenta){
      return valorCompra + valorRenta;
    };
}
