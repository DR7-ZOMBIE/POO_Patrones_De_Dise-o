package clase_5;

public class Juego {

    Usuario u = new Usuario();
    public static void main(String[] args) {
    Juego j = new Juego();

    Usuario f =  j.agregarUsuario("Carlos","232323",23.5,1);
        System.out.println(f.bonus(30));
    }

    public Usuario agregarUsuario(String nombre, String clave, double puntaje, int nivel){
        return u = new Usuario(nombre,clave,puntaje,nivel);
    }


}
