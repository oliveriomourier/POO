package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Mou", 123, 456);

        Cuenta cuentaComitente = new CuentaComitente(cliente, 100.0, "123");

        cuentaComitente.depositar(10.0);
        cuentaComitente.consultarSaldo();

        cuentaComitente.extraer(100.0);
        ((CuentaComitente)cuentaComitente).extraer(100.0, "123");
        cuentaComitente.consultarSaldo();
    }
}
