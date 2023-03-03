package com.ceiba.config;

import com.ceiba.domain.Product;
import com.ceiba.service.ProductService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppconfigTest {



    @Test
    void dadoUnaSolicitudDeProducto_cuandoSeCree_entoncesInstanciarUnNuevo()
    {
        ProductService productService = new ProductService();
        double precioVentaEsperado = 75;
        double precioVentaObtenido = productService.getSalePrice(100);
        assertEquals(precioVentaEsperado,precioVentaObtenido);

    }
}
