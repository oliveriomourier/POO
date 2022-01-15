package com.company;

import java.util.ArrayList;
import java.util.List;

public class Locomotora{
    private List<Calculable> listaPiezas;

    public Locomotora() {
        this.listaPiezas = new ArrayList<>();
    }

    public void agregarPieza(Calculable calculable){
        listaPiezas.add(calculable);
    }
    public Double calcularArea(){
        Double areaTotal = 0.0;
        for (Calculable pieza : listaPiezas) {
            areaTotal += pieza.calcularArea();
        }

        System.out.println("El area de la locomotora es " + areaTotal);
        return areaTotal;
    }

}
