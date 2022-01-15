package com.company;

import org.apache.log4j.Logger;

public class Tigre {
    private String nombre;
    private Integer edad;
    private static final Logger logger = Logger.getLogger(Leon.class);

    public Tigre(String nombre, Integer edad) throws Exception{
        this.nombre = nombre;
        this.edad = edad;

        if(this.edad < 0){
            logger.error("La edad no puede ser negativa");
            throw new Exception();
        }
    }

    public void correr(){
        logger.info("El leon " + nombre + " está corriendo");
    }

    public void esMayor10Anios(){
        if(edad>10){
            logger.info("El Tigre " + nombre + " tiene " + edad + " años");
        }
        logger.info("El Tigre " + nombre + " tiene menos de 10 años");
    }
}
