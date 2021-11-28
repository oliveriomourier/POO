package com.company;

public class Main {

    public static void main(String[] args) {
	Cliente cliente = new Cliente(1, "Mou", 123, 456);
    CuentaAhorro cuentaAhorro = new CuentaAhorro( cliente, 100.0, 0.1);
    CuentaCorriente cuentaCorriente = new CuentaCorriente(cliente, 150.0, 50.0);

    cuentaAhorro.depositar(100.0);
    cuentaAhorro.consultarSaldo();
    cuentaAhorro.extraer(150.0);
    cuentaAhorro.cobrarInteres();

    cuentaCorriente.consultarSaldo();
    cuentaCorriente.extraer(100.0);
    cuentaCorriente.extraer(70.0);
    cuentaCorriente.consultarGiro();
    cuentaCorriente.extraer(20.0);
    cuentaCorriente.consultarGiro();
    cuentaCorriente.consultarSaldo();
    cuentaCorriente.extraer(100.0);
    }
}
