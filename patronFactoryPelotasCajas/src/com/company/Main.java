package com.company;

public class Main {

    public static void main(String[] args) {
	ProductoFactory factory = ProductoFactory.getInstance();
    Almacen almacen = new Almacen();


    almacen.agregarProducto((factory.createProduct("PELOTAFUTBOL")));
    almacen.calcularEspacioNecesario();
    }
}
