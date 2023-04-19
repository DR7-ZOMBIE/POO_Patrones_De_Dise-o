package Patron_Disenio_Singleton;

public class BaseDeDatosSingleton {

    // Transformando en Singleton

    // Atributo static con el nombre de la clase

    int numero;
    private static BaseDeDatosSingleton instancia = new BaseDeDatosSingleton();

    // Constructor privado
    private BaseDeDatosSingleton(){

    }

    //Metodo public y statico

    public static BaseDeDatosSingleton obtenerIntancia(){
        return instancia;
    }

    public String mensaje(){
        return "Hola amigo";
    }


    // Un estatico esta pecado a la
    // Estructura de la clase
    // No es necesario instranciar
    // El objeto para acceder a los
    // Metodos
}
