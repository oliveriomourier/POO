package com.company;

public class CuentaComitente extends Cuenta{
    private String claveValidacion;

    public CuentaComitente(Cliente cliente, Double saldo, String claveValidacion) {
        super(cliente, saldo);
        this.claveValidacion = claveValidacion;
    }

    public void extraer(Double monto) {
        if (monto > getSaldo()* 50/100){
            System.out.println("No puede retirar este monto a menos que ingrese la clave de validacion");
        }else{
            setSaldo(getSaldo() - monto);
        }
    }

    public void extraer(Double monto, String claveValidacion){
        if (claveValidacion == this.claveValidacion && monto < getSaldo()){
            setSaldo(getSaldo() - monto);
            System.out.println("Retiro de dinero exitoso, su saldo actual es de "+getSaldo());
        }else{
            System.out.println("No puede retirar ese monto porque no lo tiene");
        }
    }

    @Override
    public void depositar(Double valor) {
        super.depositar(valor * 99/100);
    }
}
