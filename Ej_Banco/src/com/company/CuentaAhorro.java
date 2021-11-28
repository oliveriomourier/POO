package com.company;

public class CuentaAhorro extends Cuenta{
    private Double montoInteres;

    public CuentaAhorro(Cliente cliente, Double saldo, Double montoInteres) {
        super(cliente, saldo);
        this.montoInteres = montoInteres;
    }

    @Override
    public void extraer(Double monto) {
        if(monto<saldo){
            setSaldo(getSaldo()-monto);
            System.out.println("Retiro "+monto+" pesos. Le quedan "+getSaldo()+" pesos");
        }else{
            System.out.println("No puede retirar esa cantidad de dinero");
        }
    }

    public void cobrarInteres(){
        System.out.println("Usted cobro este interes: "+ getSaldo() * montoInteres);
    }
}
