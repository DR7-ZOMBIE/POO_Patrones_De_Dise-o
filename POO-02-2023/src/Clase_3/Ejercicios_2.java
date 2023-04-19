package Clase_3;

import Clase_2.Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios_2 {


    public static void main(String[] args) throws Exception {
        Clase_2.Demo d = new Demo();
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su nombre gamer 1: ");
        String a = lector.nextLine();
        // 1 es piedra
        // 2 es papel
        // 3 es tijera
        System.out.println("Porfavor escoja una opcion : ");
        System.out.println("1 es piedra");
        System.out.println("2 es papel");
        System.out.println("3 es tijera");
        System.out.println("4 es Spock");
        int b = lector.nextInt();
        if (b != 1 && b != 2 && b != 3 && b!= 4) {
            throw new Exception("Juegos terminado");
        } else {
            System.out.println("Ingrese su nombre gamer 2: ");
            String l = lector.nextLine();
            System.out.println("Porfavor escoja una opcion : ");
            System.out.println("1 es piedra");
            System.out.println("2 es papel");
            System.out.println("3 es tijera");
            System.out.println("4 es Spock");
            int w = lector.nextInt();

            if (b == 1 && w == 3 || b == 2 && w == 1 || b == 3 && w == 1 || b == 4 && w == 1 || b ==4 && w == 3 || b == 2 && w == 4) {
                System.out.println("El ganador es el gamer: " + " " + 1);

            } else if (w == 1 && b == 3 || w == 2 && b == 1 || w == 3 && b == 1 || w == 4 && b == 1 || w ==4 && b == 3 || w == 2 && b == 4) {
                System.out.println("El ganador es el gamer: " + " " + 2);
            } else {
                System.out.println("Hay un empate: " + " " + 0);
            }
        }

        for (int indice: recorrerArrayPrimo(10)) {
            System.out.println(indice);
        }

        System.out.println(horasTrabajadas(41, 898));

    }


    // Desafío 1
    //Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
    //aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
    //en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
    //una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
    //devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
    //cuando el primero elije “*” como indicador de final.

    //Desafío 2
    //Modificá la función cualGana del Desafío 1 para jugar la variante Spock: Hay una
    //posibilidad más, el señor Spock —formado por la mano Vulcana de Star Trek— tiene otros
    //poderes según:
    //Papel desaprueba Spock
    //Spock destroza tijeras
    //Spock vaporiza piedra

    //Desafío 3
    //Implementar un programa que nos permite mostrar por consola los primeros “n” números
    //primeros, siendo “n” un valor numérico ingresado por consola. Por ejemplo: Con n=7, lo
    //que debería devolver el programa es “Los primeros 7 números primos son: 2, 3, 5, 7, 11, 13,
    //17”.

    public static int[] recorrerArrayPrimo (int digito) {
        int [] primos = new int[0];
        for (int i = 0; i <= digito; i++) {
            if (verificarEsPrimo(i) ==  true){
                primos = Arrays.copyOf(primos, primos.length+1);
                primos[primos.length-1] = i;
            }
        }

        return primos;
    }

    public static boolean verificarEsPrimo(int digito) {
        int cont = 0;
        for (int i = 1; i <= digito; i++) {
            if (digito % i == 0) {
                cont += 1;
            }

        }

        if (cont == 2) {
            return true;
        }

        return false;
    }

    //Desafío 4
    //Por cuestiones laborales, se pueden trabajar hasta 40 horas semanales, si se trabajan más
    //horas las mismas se consideran horas extras cuyo valor es un 50% más que las horas de
    //trabajo normales. Crear un programa que pueda informar si el sueldo semanal de la
    //programadora Julieta. Ella trabajó en la última semana “x” cantidad de horas y el valor de la
    //hora semanal es de 875.
    //¡Ahora es tu turno!
    //¡Hasta la próxima!

    public static double horasTrabajadas(int cantidadHoras, int costoHoraSemanal) {
        double porcentaje = 0.5;
        int diferenciaHoras = 0;
        double valorFinalHoras = 0;

        if (cantidadHoras > 40) {
            diferenciaHoras = cantidadHoras - 40;
            valorFinalHoras = diferenciaHoras * porcentaje;
            return (valorFinalHoras + 40)*costoHoraSemanal;
        } else {
            return cantidadHoras * costoHoraSemanal;
        }

    }

}
