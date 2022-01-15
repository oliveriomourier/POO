package com.company;

public class CuentaCorriente extends Cuenta{
    private Double giroDescubierto;

    public CuentaCorriente(Cliente cliente, Double saldo, Double giroDescubierto) {
        super(cliente, saldo);
        this.giroDescubierto = giroDescubierto;
    }

    @Override
    public void extraer(Double monto) {

        if(monto<saldo){
            setSaldo(getSaldo()-monto);

            System.out.println("Retiro "+monto+" pesos. Le quedan "+getSaldo()+" pesos");
        }else if(monto < saldo + giroDescubierto){
            setGiroDescubierto(getSaldo()-monto + giroDescubierto);
            setSaldo(0.0);


            System.out.println("Retiro "+monto+" pesos. Usted utilizó su giro al descubierto");
        }else{
            System.out.println("No tiene fondos suficientes");
        }
    }
    public void consultarGiro(){
        System.out.println("Su giro actual es de "+giroDescubierto);
    }

    public void setGiroDescubierto(Double giroDescubierto) {
        this.giroDescubierto = giroDescubierto;
    }
}
