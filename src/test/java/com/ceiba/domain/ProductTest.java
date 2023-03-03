package com.ceiba.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProductTest {

    @Test
    void dadoUnProducto_cuandoSeCree_entoncesRetorneIdNuevoProducto()
    {
        int idProducto = 101;
        Product product = new Product(idProducto);
        assertEquals(idProducto,product.getId());
    }

    @Test
    void dadoUnProducto_cuandoSeCree_entoncesRetorneNuevoProducto()
    {

        int idProducto = 101;
        String nombreProducto = "lenteja";
        Product product = new Product(idProducto,nombreProducto);
        assertEquals(nombreProducto,product.getName());

    }

    @Test
    void dadoUnProducto_cuandoSeCreeSinConstructor_entoncesRetorneNombre()
    {
        String nombreProducto = "lenteja";
        Product product = new Product();
        product.setId(1);
        product.setName(nombreProducto);
        assertEquals(nombreProducto, product.getName());
    }



}
