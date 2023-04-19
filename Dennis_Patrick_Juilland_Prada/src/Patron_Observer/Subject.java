package Patron_Observer;

public interface Subject {

    public void agregar(Observer segudor);

    public void eliminar(Observer seguidor);

    public void notificar();


}
