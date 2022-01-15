package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleados;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public void calcularSueldo(){
        Double sueldosTotales = 0.0;
        for (Empleado empleado : empleados) {
            sueldosTotales += empleado.calcularSueldo();
        }

        System.out.println("La empresa gasta "+sueldosTotales+" en sueldos.");
    }
}
