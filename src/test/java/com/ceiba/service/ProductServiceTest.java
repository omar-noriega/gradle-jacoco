package com.ceiba.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductServiceTest {

    @Test
    void dadoUnPrecio_cuandoObtengaPrecioDeVenta_entoncesRetorneUnDescuento(){
        //Arrange
        ProductService productService = new ProductService();

        //Act

        double precioVenta = productService.getSalePrice(200);
        double precioVentaConDescuento = 150;

        //Assert
        assertEquals(precioVentaConDescuento, precioVenta);
    }
}
