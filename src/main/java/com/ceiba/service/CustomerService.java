package com.ceiba.service;

import com.ceiba.generated.Generated;

public class CustomerService {

    private String someName ="Some Name";

    //this method will be excluded from coverage due to @Generated.
    @Generated
    public String getProductId() {
        return "An ID";
    }

    public String getCustomerName() {
        return someName;
    }
}
