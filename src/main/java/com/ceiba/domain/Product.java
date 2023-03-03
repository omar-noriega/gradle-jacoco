package com.ceiba.domain;

import lombok.Data;
//Mejor no usar Builder y crear un constructor con los arg necesarios
//@Builder

//Lombok es una anotación de acceso directo conveniente
// que agrupa las características:
//@ToString, @EqualsAndHashCode, @Getter / @Setter
@Data
public class Product {
    private int id;
    private String name;

    public Product() {
    }

    public Product(int id) {
        this.id = id;
    }
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }


}
