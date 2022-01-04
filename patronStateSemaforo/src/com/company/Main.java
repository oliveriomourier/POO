package com.company;

public class Main {

    public static void main(String[] args) {
	Semaforo semaforo = new Semaforo();
    semaforo.avisoEstado();

    semaforo.cambiarEstado();
    semaforo.avisoEstado();

    semaforo.cambiarEstado();
    semaforo.avisoEstado();

    semaforo.cambiarEstado();
    semaforo.avisoEstado();

    }
}
