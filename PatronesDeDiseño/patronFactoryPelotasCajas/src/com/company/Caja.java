package com.company;

public class Caja extends Producto{
    private Double longitud;
    private Double altura;
    private Double anchura;

    public Caja(Double peso, Double longitud, Double altura, Double anchura) {
        super(peso);
        this.longitud = longitud;
        this.altura = altura;
        this.anchura = anchura;
    }

    @Override
    public double calcularEspacio() {
        return longitud * altura * anchura;
    }
}
