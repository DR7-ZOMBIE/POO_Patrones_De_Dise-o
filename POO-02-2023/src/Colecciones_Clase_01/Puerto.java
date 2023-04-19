package Colecciones_Clase_01;

import java.util.ArrayList;
import java.util.Collections;

public class Puerto {

    private String nombre;

    private String serialPuerto;

    // Cuando no hay constructor toca asi
    // Lo mejor es iniciarlo asi
    private ArrayList<Contenedor> contenedores = new ArrayList();

    public static void main(String[] args) {
    Puerto p = new Puerto();

    p.agregarCOntenedores("129","Desconocido",true);
    p.agregarCOntenedores("124","Desconocido",true);
    p.agregarCOntenedores("125","Argentina",true);
    p.recorrerContenedores();
    System.out.println("--------------------------------------------------");
        p.oredenarPorNumeroIdentificado();
        p.recorrerContenedores();
            System.out.println("---------------------------------------------------");
            System.out.println(p.isPaisDeconocidoContar());
            p.recorrerContenedores();


    }

    public void agregarCOntenedores(String numeroID, String pais, boolean isPeligroso){
        contenedores.add(new Contenedor(numeroID,pais,isPeligroso)); //Lo agrega siempre al final
    }

    public void recorrerContenedores (){
        for (Contenedor contenedor:contenedores) {
            System.out.println(contenedor.toString());
        }
    }

    // Sort de Menor a Mayor
    // Pero debe llevar un SORT antes si no no lo logra hacer
    // Reverse Mayor a Menor
    public ArrayList<Contenedor> oredenarPorNumeroIdentificado (){
        Collections.sort(contenedores);
        return contenedores;
    }

    public int isPaisDeconocidoContar () {
        int cont = 0;
        for (int i = 0; i < contenedores.size(); i++) {
            if (contenedores.get(i).getPais().compareTo("Desconocido") == 0){
                cont++;
            }
        }
        return cont;
    }

}
