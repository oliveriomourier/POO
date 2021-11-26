package com.company;

public class Cliente {
    private Integer numeroCliente;
    private  String apellido;
    private Integer DNI;
    public Integer CUIT;
    private Cuenta cuenta;

    public Cliente(Integer numeroCliente, String apellido, Integer DNI, Integer CUIT, Cuenta cuenta){
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.DNI = DNI;
        this.CUIT = CUIT;
        this.cuenta = cuenta;
    }
}
