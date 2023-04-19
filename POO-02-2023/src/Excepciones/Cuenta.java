package Excepciones;

import java.util.ArrayList;
import java.util.Comparator;

public class Cuenta implements Comparator<Cuenta> {

    public static void main(String[] args) throws CuentaException {

        int num = 4;
        int num2 = 0;

        if (num2 == 0) {
            throw new RuntimeException("No se puede dividir por cero");
        }else if(num2 != 0){
            System.out.println(num/num2);
        }


    }
    private String titular;
    private double saldo;
    public Cuenta(String titular, double saldo) throws CuentaException
    {
        this.titular=titular;
        if (saldo<0)
            throw new CuentaException("No se puede crear una cuenta con saldo negativo");
        this.saldo=saldo;
    }
    public void extraer(double importe) throws  CuentaException
    {
        if (importe >saldo)
            throw new CuentaException("No hay saldo sufieciente para esta extracción");
        saldo=saldo-importe;
    }
    public void depositar(double importe)
    {
        saldo+=importe;
    }


    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        o1.compare(o1,o2);
        return 0;
    }
}