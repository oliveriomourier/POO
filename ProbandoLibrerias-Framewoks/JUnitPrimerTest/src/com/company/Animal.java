package com.company;

public class Animal {
    private String tipo;
    private String tamanio;
    private int peso;

    public Animal(String tipo, String tamanio, int peso) {
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.peso = peso;
    }

    public Boolean esPesado(){
        return peso > 2000 && tamanio.equals("grande");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
