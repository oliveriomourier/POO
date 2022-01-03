package com.company;

public class EmpleadoFactory {
    public static final String EMPLEADO_PH = "Empleado PH";
    public static final String EMPLEADO_RD = "Empleado RD";
    private static EmpleadoFactory instancia = new EmpleadoFactory();

    private EmpleadoFactory() {
    }

    public static EmpleadoFactory getInstance(){
        return instancia;
    }

    public Empleado fabrica(String codigo){
        if(codigo == EMPLEADO_RD){
            return new EmpleadoRelacionDependencia();
        }
        if(codigo == EMPLEADO_PH){
            return new EmpleadoPorHora();
        }
        else{
            return null;
        }

    }
}
