package com.gabriel.cleanarch.core.dataprovider;

import com.gabriel.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);
}
