package com.company.estados;

import com.company.Estado;

public class Verde implements Estado {

    @Override
    public Estado cambiarEstado() {
        return new Amarillo();
    }

    @Override
    public String toString() {
        return "Estoy en verde";
    }
}
