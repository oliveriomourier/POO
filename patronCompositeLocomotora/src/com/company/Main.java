package com.company;

public class Main {

    public static void main(String[] args) {
	Triangulo triangulo = new Triangulo(20.0, 5.0);
    Circulo circulo = new Circulo(5.0);
    Rectangulo rectangulo = new Rectangulo(10.0, 10.0);

    Combos combo1 = new Combos();
    combo1.agregarCalculable(triangulo);
    combo1.agregarCalculable(circulo);
    combo1.calcularArea();

    Locomotora locomotora = new Locomotora();
    locomotora.agregarPieza(rectangulo);
    locomotora.agregarPieza(combo1);
    locomotora.calcularArea();
    }
}
