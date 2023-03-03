package com.ceiba.service;

public class ProductService {
    private static final double DISCOUNT = 0.25;

    public double getSalePrice(double originalPrice)
    {
        return originalPrice - originalPrice * DISCOUNT;
    }

    public double calcularNuevoPrecio(double porcentajeDescuento, double originalPrice) {

        double descuento = 0;
        if(porcentajeDescuento>0) {
            descuento  = porcentajeDescuento/100;
        }
            return originalPrice - originalPrice * descuento;

    }
}
