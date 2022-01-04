package com.company;

import com.company.estados.EstadoTriste;

public class Tamagochi {
    private String nombre;
    private Estado estadoActual;

    public Tamagochi(String nombre){
        this.nombre = nombre;
        this.estadoActual = new EstadoTriste();
    }

    public void darDeComer(){
        estadoActual = estadoActual.comer();
    }
    public void darDeBeber(){
        estadoActual = estadoActual.beber();
    }
    public void mimar(){
        estadoActual = estadoActual.mimar();
    }

    public void imprimirEstadoActual(){
        System.out.println(estadoActual);
    }
}
