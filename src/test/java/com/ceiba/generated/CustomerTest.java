package com.ceiba.generated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    @Test
    void dadoUnCliente_cuandoSeCree_entoncesRespondaToString(){
        Customer customer = new Customer();
        String respuestaCustomer = "Customer{}";
        assertEquals(respuestaCustomer,customer.toString());
    }
}
