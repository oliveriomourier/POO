package com.company;

public class Main {

    public static void main(String[] args) {
	Capitan capitan = new Capitan("Oli", "Mou", 123);
    Velero velero1 = new Velero(capitan, 100.0, 10.0, 2022, 150.0, 5);
    Velero velero2 = new Velero(capitan, 100.0, 10.0, 2019, 180.0, 7);

    System.out.println("El precio del velero1 es:"+velero1.calcularMonto());
    System.out.println("El precio del velero2 es:"+velero2.calcularMonto());
    System.out.println(velero1.compareTo(velero2));


    Yate yate1 = new Yate(capitan, 100.0, 10.0, 2022, 150.0, 5);
    Yate yate2 = new Yate(capitan, 100.0, 10.0, 2022, 150.0, 3);
    System.out.println(yate1.compareTo(yate2));




    }
}
