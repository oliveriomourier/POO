package com.company;

import com.company.estados.Verde;

public class Semaforo {
    private Estado estadoActual;

    public Semaforo(){
        estadoActual = new Verde();
    }

    public void cambiarEstado(){
        estadoActual = estadoActual.cambiarEstado();
    }
    public void avisoEstado(){
        System.out.println(estadoActual);
    }
}
