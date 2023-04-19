package patron_State;

public class Hambriento implements TamagochiState{


    private String nombre = "Hambriento";

    private Tamagochi tamagochi;

    public Hambriento(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void beber() {

    }

    @Override
    public void comer() {
        System.out.println("Estoy en:" + this.nombre +  "estoy comiendo");
        this.tamagochi.setEstado(new Hambriento(this.tamagochi));

    }

    @Override
    public void mimar() {

    }
}
