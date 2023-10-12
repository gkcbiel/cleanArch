package com.gabriel.cleanarch.config;

import com.gabriel.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.gabriel.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.gabriel.cleanarch.core.usecase.impl.UpdateCustomerUseCaseimpl;
import com.gabriel.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseimpl updateCustomerUseCase(FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
                                                           FindAddressByZipCode findAddressByZipCode,
                                                           UpdateCustomerImpl updateCustomer) {
        return new UpdateCustomerUseCaseimpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }

}
