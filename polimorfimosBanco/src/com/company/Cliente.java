package com.company;

public class Cliente {
    private Integer nroCliente;
    private String apellido;
    private Integer dni;
    private Integer cuil;

    public Cliente(Integer nroCliente, String apellido, Integer dni, Integer cuil) {
        this.nroCliente = nroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuil = cuil;
    }
}
