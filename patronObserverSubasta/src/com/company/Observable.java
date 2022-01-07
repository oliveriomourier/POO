package com.company;

public interface Observable {
    public void agregar(Observador observador);
    public void quitar(Observador observador);
    public void notificar();
}
