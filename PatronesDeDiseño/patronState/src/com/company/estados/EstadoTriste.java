package com.company.estados;

import com.company.Estado;

public class EstadoTriste implements Estado {
    @Override
    public Estado comer() {
        return new EstadoSediento();
    }

    @Override
    public Estado beber() {
        return new EstadoHambriento();
    }

    @Override
    public Estado mimar() {
        return new EstadoFeliz();
    }
}
