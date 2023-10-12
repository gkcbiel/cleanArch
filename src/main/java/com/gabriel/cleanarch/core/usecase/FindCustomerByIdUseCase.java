package com.gabriel.cleanarch.core.usecase;

import com.gabriel.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
