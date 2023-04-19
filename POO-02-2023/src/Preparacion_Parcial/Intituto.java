package Preparacion_Parcial;

import java.time.LocalDate;

public class Intituto {



    public static void main(String[] args) {
    Persona p = new Persona("10172581y2","Nacho");
    Materia materia1 = new Materia("castellano","103");
    Materia materia2 = new Materia("castellano","103");
        Materia[] materias = {materia1,materia2};

        Terciarios titutloTerciario1 = new Terciarios(LocalDate.now(),LocalDate.now(),true
                ,true,new Materia[] {materia1,materia2},p,true);

        Licenciatura titutloLicenciatura1 = new Licenciatura(LocalDate.now(),LocalDate.now(),true
                ,true,new Materia[] {materia1,materia2},p,"jnnsd",LocalDate.now(),10);

        Licenciatura titutloLicenciatura2 = new Licenciatura(LocalDate.now(),LocalDate.now(),true
                ,true,new Materia[] {materia1,materia2},p,"jnnsd",LocalDate.now(),10);

        System.out.println(titutloTerciario1.ejercerTitulo());

        System.out.println(titutloLicenciatura1.compareTo(titutloLicenciatura2));

        System.out.println(titutloTerciario1.verificarIsNacional());


    }




}
