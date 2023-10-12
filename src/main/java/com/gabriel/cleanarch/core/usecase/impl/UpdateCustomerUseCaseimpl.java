package com.gabriel.cleanarch.core.usecase.impl;

import com.gabriel.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.gabriel.cleanarch.core.dataprovider.UpdateCustomer;
import com.gabriel.cleanarch.core.domain.Customer;
import com.gabriel.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.gabriel.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseimpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final FindAddressByZipCode findAddressByZipCode;

    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseimpl (FindCustomerByIdUseCase findCustomerByIdUseCase, FindAddressByZipCode findAddressByZipCode, UpdateCustomer updateCustomer){
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.getId());
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}
