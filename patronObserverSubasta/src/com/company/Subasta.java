package com.company;

import java.util.ArrayList;
import java.util.List;

public class Subasta implements Observable {
    private Double precio;
    private String descripcion;
    private List<Observador> listaOferentes;

    public Subasta(Double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.listaOferentes = new ArrayList<>();
    }

    @Override
    public void agregar(Observador observador) {
        listaOferentes.add(observador);
    }

    @Override
    public void quitar(Observador observador) {
        listaOferentes.remove(observador);

    }

    @Override
    public void notificar() {
        for (Observador Oferente : listaOferentes) {
            Oferente.actualizar(precio);
        }
    }

    public List<Observador> getListaOferentes() {
        return listaOferentes;
    }
}
