package com.company;

import org.apache.log4j.Logger;

public class Main {

    public static void main(String[] args) throws Exception{
        final Logger logger = Logger.getLogger(Main.class);
        try{
            Leon leon = new Leon("Simba", 11, true);
            leon.correr();
            leon.esMayor10AniosYAlfa();

            Tigre tigre = new Tigre("Rey", 2);
            tigre.correr();
            tigre.esMayor10Anios();

            Leon leon2 = new Leon("Pepito", -2, false);
        }catch(Exception e){
            logger.error("Ocurrio un error");
        }
    }
}
