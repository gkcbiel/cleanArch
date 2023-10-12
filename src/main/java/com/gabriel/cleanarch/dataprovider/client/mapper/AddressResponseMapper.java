package com.gabriel.cleanarch.dataprovider.client.mapper;

import com.gabriel.cleanarch.core.domain.Address;
import com.gabriel.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
