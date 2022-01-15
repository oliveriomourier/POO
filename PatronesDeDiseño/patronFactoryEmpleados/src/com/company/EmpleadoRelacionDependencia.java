package com.company;

public class EmpleadoRelacionDependencia extends Empleado{
    private Double sueldoMensual;

    public EmpleadoRelacionDependencia(String nombre, String apellido, Integer legajo, Double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;
    }

    public EmpleadoRelacionDependencia() {
        super("Maria", "Empleada", 002);
        sueldoMensual = 1000.0;
    }

    @Override
    public Double calcularSueldo() {
        return sueldoMensual;
    }
}
