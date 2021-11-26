package com.company;

public class Main {

    public static void main(String[] args) {
        CajaAhorro cuenta1 = new CajaAhorro(112.0,0.1);
        Cliente cliente = new Cliente(64, "Gonzalez",39456765, 1394567654,cuenta1);

        cuenta1.depositar(345.0);
        cuenta1.extraer(2899992.23);
        cuenta1.informarSaldo();
        cuenta1.cobrarInteres();
        cuenta1.informarSaldo();
    }
}
