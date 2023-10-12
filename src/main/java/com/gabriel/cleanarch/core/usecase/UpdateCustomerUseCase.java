package com.gabriel.cleanarch.core.usecase;

import com.gabriel.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);
}
