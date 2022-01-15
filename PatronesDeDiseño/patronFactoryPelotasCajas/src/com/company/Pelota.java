package com.company;

public class Pelota extends Producto{
    private Double radio;

    public Pelota(Double peso, Double radio) {
        super(peso);
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        return Math.PI * Math.pow(radio, 3) * 4/3;
    }
}
