package com.gabriel.cleanarch.core.usecase.impl;

import com.gabriel.cleanarch.core.dataprovider.DeleteCustomerById;
import com.gabriel.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.gabriel.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final DeleteCustomerById deleteCustomerById;

    public DeleteCustomerByIdUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase, DeleteCustomerById deletecustomerById){
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomerById = deletecustomerById;
    }

    @Override
    public void delete(String id) {
        var customer = findCustomerByIdUseCase.find(id);
        deleteCustomerById.delete(customer.getId());
    }
}
