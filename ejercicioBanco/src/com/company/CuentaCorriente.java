package com.company;

public class CuentaCorriente extends Cuenta{
    private Double saldo;
    private Double montoSobregiro;

    public CuentaCorriente(Double saldo, Double montoSobregiro){
        this.saldo = saldo;
        this.montoSobregiro = montoSobregiro;
    }
    @Override
    public void depositar(Double valor) {
        saldo += valor;
    }

    @Override
    public void extraer(Double valor) {
        if (saldo + montoSobregiro >= valor){
            saldo -= valor;
        }else {
            System.out.println("El monto de sobregiro de tu cuenta corriente es insuficiente para realizar esta transacción.");
        }
    }

    @Override
    public void informarSaldo() {
        System.out.println("Tu saldo es de " + saldo + " pesos.");
    }
}
