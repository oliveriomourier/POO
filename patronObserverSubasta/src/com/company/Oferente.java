package com.company;

public class Oferente implements Observador{
    private String nombre;
    private String apellido;
    private Integer dni;
    private Double montoTope;

    public Oferente(String nombre, String apellido, Integer dni, Double montoTope) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.montoTope = montoTope;
    }

    @Override
    public void actualizar(Double precioSubasta) {
        if(precioSubasta < montoTope){
            System.out.println(nombre + " " + apellido + " oferta: " + montoTope);
        }
    }
}
