package clase_5;

import java.util.Arrays;

public class Videojuego {

    usuarioJuego[] u = new usuarioJuego[0];

    public static void main(String[] args) {

        Videojuego m = new Videojuego();

        usuarioJuego u2 = m.agregarUsuarios("Andres","12121",100,0);
        System.out.println("Metodo agregacion y verificando su funcionalidad:");
        System.out.println(  u2.bonus(200));

        System.out.println("---------------------------------------------------------------------------");

        usuarioJuego primerUsuario = new usuarioJuego("Carlos","1212",0,0);

        System.out.println("El puntaje nuevo es:");
        System.out.println(primerUsuario.bonus(100));

        System.out.println("--------------------------------------------------------------------------");

        System.out.println("El nivel se aumenta a:");
        System.out.println(primerUsuario.aumentarNivel(2));

        System.out.println("--------------------------------------------------------------------------");

        System.out.println("El nombre del primer ususario es:");
        System.out.println(primerUsuario.getNombre());
        System.out.println("La modificacion del nombre del usuario es :");
        primerUsuario.setNombre("Enriqaue");
        System.out.println(primerUsuario.getNombre());

        System.out.println("---------------------------------------------------------------------------");

        primerUsuario.aumentarPuntaje(100);

    }

    public usuarioJuego agregarUsuarios(String nombre, String clave, double puntaje, int nivel) {
        u = Arrays.copyOf(u,u.length+1);
        return u[u.length-1] = new usuarioJuego(nombre,clave,puntaje,nivel);
    }


}
