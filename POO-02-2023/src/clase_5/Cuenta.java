package clase_5;

public class Cuenta {

    public static void main(String[] args) {
        Cuenta c = new Cuenta();

        c.depositar(500);
        System.out.println(c.getSaldo());
        c.retirar(500);
        System.out.println(c.getSaldo());
    }
    private int numeroDeCuenta;
    private Double saldo = 30.5;

    //crear la funcion depositar y retirar aca

    public void depositar(double cantidadDinero){
        setSaldo( this.saldo + cantidadDinero);
        System.out.println(this.saldo);
    }

    public void retirar(double cantidadDinero){
        if(this.saldo>=cantidadDinero){
            setSaldo(this.saldo - cantidadDinero);
        }else{
            System.out.println("no se puede retirar");
        }

    }


    //no tocar estas funciones
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }
}
