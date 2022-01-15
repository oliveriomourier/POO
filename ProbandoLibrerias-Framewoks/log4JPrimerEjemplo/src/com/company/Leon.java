package com.company;

import org.apache.log4j.Logger;

public class Leon {
    private String nombre;
    private Integer edad;
    private Boolean esAlfa;
    private static final Logger logger = Logger.getLogger(Leon.class);

    public Leon(String nombre, Integer edad, Boolean esAlfa) throws Exception{
        this.nombre = nombre;
        this.edad = edad;
        this.esAlfa = esAlfa;

        if(this.edad < 0){
            logger.error("La edad no puede ser negativa");
            throw new Exception();
        }
    }

    public void correr(){
        logger.info("El leon " + nombre + " está corriendo");
    }

    public void esMayor10AniosYAlfa(){
        if(edad>10 && esAlfa){
            logger.info("El leon " + nombre + " tiene " + edad + " años y es alfa");
        }else {
            logger.info("El leon " + nombre + " tiene menos de 10 años");
        }
    }
}
