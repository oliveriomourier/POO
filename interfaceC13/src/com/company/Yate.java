package com.company;

public class Yate extends Embarcacion{
    private Integer cantidadCamarotes;

    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public int compareTo(Object obj){
        Yate yate2 = (Yate) obj;
        Integer respuesta = 0;

        if(this.getCantidadCamarotes() > yate2.getCantidadCamarotes()){
            respuesta = 1;
        }
        if(this.getCantidadCamarotes() < yate2.getCantidadCamarotes()){
            respuesta = -1;
        }

        return respuesta;
    }

    public Integer getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(Integer cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }
}
