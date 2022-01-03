package com.company;
import java.lang.*;

public class Velero extends Embarcacion{
    private Integer cantidadMastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public int compareTo(Object obj){
        Velero velero2 = (Velero) obj;
        int respuesta = 0;

        if(this.getCantidadMastiles() > velero2.getCantidadMastiles()){
            respuesta = 1;
        }
        if(this.getCantidadMastiles() < velero2.getCantidadMastiles()){
            respuesta = -1;
        }

        return respuesta;

    }

    public Integer getCantidadMastiles() {
        return cantidadMastiles;
    }

    public void setCantidadMastiles(Integer cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }
}
