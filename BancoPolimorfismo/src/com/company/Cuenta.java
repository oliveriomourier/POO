package com.company;

public abstract class Cuenta {
    private Cliente cliente;
    public Double saldo;

    public Cuenta(Cliente cliente,Double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valor){
        saldo += valor;
    }
    public abstract void extraer(Double monto);

    public void consultarSaldo(){
        System.out.println("Su saldo es de "+saldo+" pesos.");
    }
}
