package com.gabriel.cleanarch.core.usecase;

import com.gabriel.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode );
}
