package patron_State;

public class Tamagochi {

    private TamagochiState estado;

    public void beber(){
        this.estado.beber();
    };

    public void comer(){
        this.estado.comer();
    };

    public void mimar(){
        this.estado.mimar();
    };

    public TamagochiState getEstado() {
        return estado;
    }

    public void setEstado(TamagochiState estado) {
        this.estado = estado;
    }
}
