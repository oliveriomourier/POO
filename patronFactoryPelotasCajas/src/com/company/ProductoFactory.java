package com.company;

public class ProductoFactory {
    private static ProductoFactory instance = new ProductoFactory();

    public ProductoFactory() {
    }

    public static ProductoFactory getInstance() {
        return instance;
    }

    public Producto createProduct(String name){
        if(name == "CAJA10x10"){
            return new Caja(0.5, 10.0, 10.0, 10.0);
        }
        if(name == "PELOTATENIS"){
            return new Pelota(0.2, 0.32);
        }
        if(name == "PELOTAFUTBOL"){
            return new Pelota(0.2, 11.0);
        }
        else{
            return null;
        }
    }
}
