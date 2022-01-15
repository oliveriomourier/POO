package com.company.estados;

import com.company.Estado;

public class EstadoSediento implements Estado {

    @Override
    public Estado comer() {
        return new EstadoFeliz();
    }

    @Override
    public Estado beber() {
        return new EstadoFeliz();
    }

    @Override
    public Estado mimar() {
        return new EstadoHambriento();
    }
}
