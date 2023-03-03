package com.ceiba.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class CustomerServiceTest {

    //Arrange = Preparación
    CustomerService customerService = new CustomerService();

    //GIVEN - WHEN - THEN
    @Test
    void dadoCliente_cuandoConsulteCliente_entoncesRetorneNuevoCliente(){



        //Act = Probar el método
        //Assert = Validar o comprobar

        assertNotNull(customerService.getCustomerName());
    }

    @Test
    void dadoCliente_cuandoConsulteCliente_entoncesRetorneProductId(){


        //Act = Probar el método
        //Assert = Validar o comprobar

        assertNotNull(customerService.getProductId());
    }
}
