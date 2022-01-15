package com.company.estados;

import com.company.Estado;

public class Amarillo implements Estado {

    @Override
    public Estado cambiarEstado() {
        return new Rojo();
    }

    @Override
    public String toString() {
        return "Estoy en amarillo";
    }
}
