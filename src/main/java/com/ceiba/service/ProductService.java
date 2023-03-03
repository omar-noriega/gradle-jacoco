package com.ceiba.service;

public class ProductService {
    private static final double DISCOUNT = 0.25;

    public double getSalePrice(double originalPrice)
    {
        return originalPrice - originalPrice * DISCOUNT;
    }
}
