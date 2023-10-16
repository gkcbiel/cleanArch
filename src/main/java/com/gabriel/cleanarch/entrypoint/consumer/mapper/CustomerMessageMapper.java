package com.gabriel.cleanarch.entrypoint.consumer.mapper;

import com.gabriel.cleanarch.core.domain.Customer;
import com.gabriel.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
