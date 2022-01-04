package com.company.estados;

import com.company.Estado;

public class EstadoFeliz implements Estado {

    @Override
    public Estado comer() {
        return this;
    }

    @Override
    public Estado beber(){
        return new EstadoHambriento();
    }

    @Override
    public Estado mimar() {
        return this;
    }
}
