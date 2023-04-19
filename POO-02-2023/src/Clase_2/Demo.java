package Clase_2;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Demo d = new Demo();
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el valor de compra:");
        double a = lector.nextDouble();
        System.out.println("Ingrese el valor de reventa:");
        double b = lector.nextDouble();
        System.out.println("Su ganacia es de");
        double ganacia = b - a;
        double margenPorcentual = (100 / a) * ganacia;
        System.out.println(margenPorcentual);
        System.out.println(d.calcularRenta(1000, 1500));
        System.out.println(d.verificarEsPrimo(17));
        System.out.println(d.maxNumeros(49,79,9));
        System.out.println(d.verificarCadenas("hola","holA"));

    }

    public double calcularRenta(double valorCompra, double valorReventa) {
        double ganacia = valorReventa - valorCompra;
        return (100 / valorCompra) * ganacia;
    }

    //Ejercitación Funciones
    //Ejercicio 1
    //Hacer una función que dado un número indica si es un número primo o no. Un número
    //primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
    //ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por
    //17.

    public boolean verificarEsPrimo (int numero) {
        int cont = 0;
        for (int i = numero; i > 0 ; i--) {
            if (numero % i == 0) {
                cont++;
            }
        }
        if (cont == 2){
            return true;
        }else{
            return false;
        }
    };

    //Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
    //función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
    //obtenida en el ejercicio desarrollado en la clase asincrónica. boolean esDivisible(int n, int
    //divisor)


    //Ejercicio 2
    //Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
    //Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
    //unNumeroC)
    //Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
    //el resultado.

    public int maxNumeros (int num1, int num2 , int num3){
        if (num1 > num2 && num1 > num3) {
            return num1;
        }else if(num2 > num1 & num2 > num3){
            return num2;
        }else{
            return num3;
        }
    };


    //Ejercicio 3
    //Escribir una función:
    //boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
    //que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
    //false, en caso de que coincidan.

    public boolean verificarCadenas(String a, String b){
        if (a.equals(b)) {
            return true;
        }
        return false;
    };
}
