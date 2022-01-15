package com.company;

public class EmpleadoPorHora extends Empleado {
    private Double importePorHora;
    private Integer horasTrabajadas;

    public EmpleadoPorHora(String nombre, String apellido, Integer legajo, Double importePorHora) {
        super(nombre, apellido, legajo);
        this.importePorHora = importePorHora;
        this.horasTrabajadas = 0;
    }

    public EmpleadoPorHora() {
        super("Juan", "Carlos", 001);
        importePorHora = 10.0;
        horasTrabajadas = 5;
    }

    @Override
    public Double calcularSueldo() {
        return importePorHora * horasTrabajadas;
    }
    public void cargarHoras(Integer horasNuevas){
        horasTrabajadas += horasNuevas;
    }
}
