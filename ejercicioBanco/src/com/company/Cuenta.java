package com.company;

public abstract class Cuenta {

    public Cuenta(){
    }

    public abstract void depositar(Double valor);
    public abstract void extraer(Double valor);
    public abstract void informarSaldo();
}
