package com.company;

public class Main {

    public static void main(String[] args) {
	    Subasta subasta = new Subasta(500.0, "Guernica");
        Oferente oferente1 = new Oferente("Emma", "Soriano", 1, 750.0);
        Oferente oferente2 = new Oferente("Clementina", "Mou", 2, 300.0);
        Oferente oferente3 = new Oferente("Manuel", "Cam", 3, 700.0);

        subasta.agregar(oferente1); subasta.agregar(oferente2); subasta.agregar(oferente3);
        subasta.notificar();

        subasta.quitar(oferente3);
        System.out.println(subasta.getListaOferentes().size());
    }
}
