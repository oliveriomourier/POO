package com.company.estados;

import com.company.Estado;

public class EstadoHambriento implements Estado {
    @Override
    public Estado comer() {
        return new EstadoSediento();
    }

    @Override
    public Estado beber() {
        return this;
    }

    @Override
    public Estado mimar() {
        return new EstadoFeliz();
    }
}
