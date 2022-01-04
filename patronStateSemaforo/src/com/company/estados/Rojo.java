package com.company.estados;

import com.company.Estado;

public class Rojo implements Estado {

    @Override
    public Estado cambiarEstado() {
        return new Verde();
    }

    @Override
    public String toString() {
        return "Estoy en rojo";
    }
}
