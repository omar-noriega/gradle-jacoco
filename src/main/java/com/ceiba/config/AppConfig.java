package com.ceiba.config;

import com.ceiba.service.ProductService;

public class AppConfig {

    public ProductService productService() {
        return new ProductService();
    }

}
