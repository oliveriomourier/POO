package com.company;

public class Main {

    public static void main(String[] args) {
	EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();
    Empresa empresa = new Empresa("Sociedad anonima");

    empresa.agregarEmpleado(empleadoFactory.fabrica(empleadoFactory.EMPLEADO_RD));
    empresa.agregarEmpleado(empleadoFactory.fabrica(empleadoFactory.EMPLEADO_PH));
    empresa.calcularSueldo();
    }
}
