package com.company;

public abstract class Producto {
    private Double peso;

    public Producto(Double peso) {
        this.peso = peso;
    }

    public abstract double calcularEspacio();
}
