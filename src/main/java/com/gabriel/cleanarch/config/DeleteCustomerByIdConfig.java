package com.gabriel.cleanarch.config;

import com.gabriel.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.gabriel.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.gabriel.cleanarch.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(FindCustomerByIdUseCaseImpl findCustomerByIdUseCase, DeleteCustomerByIdImpl deleteCustomerById){
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, deleteCustomerById);
    }
}
