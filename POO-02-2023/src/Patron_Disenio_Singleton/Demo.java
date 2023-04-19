package Patron_Disenio_Singleton;

public class Demo {

    public static void main(String[] args) {
        // No te va a dejar asi da error
        // BaseDeDatosSingleton bd = new BaseDeDatosSingleton();
        // Estos valores se aginan a la memoria jamas cambian
        // Si lo instancia con new si asigna otra memoria

        BaseDeDatosSingleton bd = BaseDeDatosSingleton.obtenerIntancia();
        BaseDeDatosSingleton bd2 = BaseDeDatosSingleton.obtenerIntancia();
        BaseDeDatosSingleton bd3 = BaseDeDatosSingleton.obtenerIntancia();
        bd.numero = 21;
        bd2.numero = 40;
        bd3.numero = 50;
        System.out.println(bd2.numero);
        System.out.println(bd.numero);
        System.out.println(bd3.numero);

    }
}
