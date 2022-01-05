package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combos implements Calculable{
    private List<Calculable> listaCalculables;

    public Combos() {
        this.listaCalculables = new ArrayList<>();
    }

    public void agregarCalculable(Calculable calculable){
        listaCalculables.add(calculable);
    }

    @Override
    public Double calcularArea() {
        Double areaTotal = 0.0;
        for (Calculable calculable : listaCalculables) {
            areaTotal += calculable.calcularArea();
        }
        System.out.println("El area del combo es:" + areaTotal);
        return areaTotal;
    }
}
