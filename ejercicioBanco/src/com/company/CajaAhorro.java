package com.company;

public class CajaAhorro extends Cuenta {
    private Double saldo;
    private Double interes;

    public CajaAhorro(Double saldo, Double interes) {
        this.interes = interes;
        this.saldo = saldo;
    }

    @Override
    public void depositar(Double valor) {
        saldo += valor;
    }

    @Override
    public void extraer(Double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("No tiene saldo suficiente.");
        }
    }

    @Override
    public void informarSaldo() {
        System.out.println("Tu saldo es de " + saldo + " pesos.");
    }

    public void cobrarInteres(){
        saldo += saldo * (interes / 12);
    }
}
