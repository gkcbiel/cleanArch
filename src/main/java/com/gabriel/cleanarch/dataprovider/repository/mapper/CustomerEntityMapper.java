package com.gabriel.cleanarch.dataprovider.repository.mapper;

import com.gabriel.cleanarch.core.domain.Customer;
import com.gabriel.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
