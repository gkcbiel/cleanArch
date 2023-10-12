package com.gabriel.cleanarch.config;

import com.gabriel.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.gabriel.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.gabriel.cleanarch.dataprovider.InsertCustomerImpl;
import com.gabriel.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }

}
