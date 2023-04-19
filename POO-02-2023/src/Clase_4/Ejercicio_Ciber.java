package Clase_4;

import java.util.Scanner;

public class Ejercicio_Ciber {

        public static void main(String[] args){
            int clave;

            Scanner scn = new Scanner(System.in);
            System.out.print("Introdusca la llave: ");
            clave = scn.nextInt();
            scn.close();

            if(1338557220 / clave * clave != 1338557220 && clave > 0){
                System.out.println("Autenticacion correcta. La bandera es un número pequeño que te dejara entrar.");
            }else{
                System.out.println("Autenticacion incorrecta.");
            }
        }
}
