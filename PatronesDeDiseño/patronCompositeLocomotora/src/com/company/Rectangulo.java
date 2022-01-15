package com.company;

public class Rectangulo implements Calculable{
    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura= altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }
}
