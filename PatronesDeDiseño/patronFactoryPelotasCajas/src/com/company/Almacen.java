package com.company;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Producto> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public double calcularEspacioNecesario(){
        Double contador = 0.0;
        for (Producto producto : productos) {
            contador += producto.calcularEspacio();
        }
        System.out.println("Necesita " + contador + " cm de espacio.");
        return contador;
    }
}
