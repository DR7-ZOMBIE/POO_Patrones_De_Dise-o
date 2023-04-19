package Clase_3;

import java.sql.Array;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        int a = 45;
        int b = 10;

        System.out.println(a);

        if (a == 45 || b == 0) {
            System.out.println("Uno almenos es igual");
        } else {
            System.out.println("No soy igual");
        }

        switch (a) {
            case 10:
                System.out.println("Entre al primer caso");
                break;
            case 12:
                System.out.println("Es el segundo caso");
                break;
            default:
                System.out.println("Hola");
        }

        int[] miArray = new int[3];
        miArray[0] = 10;
        miArray[1] = 3;
        miArray[2] = 5;

        for (int i = 0; i <miArray.length ; i++) {
            System.out.println(miArray[i]);
        }

        String[] texto = {"Carlos","Andres"};

        for (String elemento : texto) {
            System.out.println(elemento);
        }

        for (int indice: miArray) {
            System.out.println(indice);
        }

        int[] c = Arrays.copyOf(miArray,miArray.length+1);
        c[c.length-1] = 4;

        for (int indice:c) {
            System.out.println(indice);
        }

        System.out.println(probar(12));
    }

    public static boolean probar(int a){
        if (a > 10) {
            return true;
        }

        return false;
    }

    //Desafío 1
    //Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
    //aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
    //en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definír y utilizar
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


    //Desafío 4
    //Por cuestiones laborales, se pueden trabajar hasta 40 horas semanales, si se trabajan más
    //horas las mismas se consideran horas extras cuyo valor es un 50% más que las horas de
    //trabajo normales. Crear un programa que pueda informar si el sueldo semanal de la
    //programadora Julieta. Ella trabajó en la última semana “x” cantidad de horas y el valor de la
    //hora semanal es de 875.
    //¡Ahora es tu turno!
    //¡Hasta la próxima!



}
