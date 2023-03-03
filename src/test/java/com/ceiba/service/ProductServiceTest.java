package com.ceiba.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductServiceTest {

    @DisplayName("dadoUnPrecio_cuandoObtengaPrecioDeVenta_entoncesRetorneUnDescuento")
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

    @DisplayName("dadoUnNuevoDescuento_cuadoSeObtengaPrecio_entoncesCalcularNuevoPrecio")
    @Test
    void dadoUnNuevoDescuento_cuadoSeObtengaPrecio_entoncesCalcularNuevoPrecio()
    {
        //Arrange
        ProductService productService = new ProductService();
        double precioVentaConDescuento = 350;
        double nuevoPrecioConDescuento = 0;
        //Act
        nuevoPrecioConDescuento = productService.calcularNuevoPrecio(30, 500);


        //Assert
        assertEquals(precioVentaConDescuento, nuevoPrecioConDescuento);

    }

    @DisplayName("dadoUnPrecioSinDescuento_cuadoSeObtenga_entoncesCalcularNuevoPrecio")
    @Test
    void dadoUnPrecioSinDescuento_cuadoSeObtenga_entoncesCalcularNuevoPrecio()
    {
        //Arrange
        ProductService productService = new ProductService();
        double descuento = 0;
        double precioVenta = 350;
        double precioVentaConDescuento = precioVenta;
        double nuevoPrecioConDescuento = 0;
        //Act
        nuevoPrecioConDescuento = productService.calcularNuevoPrecio(descuento, precioVenta);


        //Assert
        assertEquals(precioVentaConDescuento, nuevoPrecioConDescuento);

    }

}
