package com.gabriel.cleanarch.dataprovider;

import com.gabriel.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.gabriel.cleanarch.core.domain.Address;
import com.gabriel.cleanarch.dataprovider.client.FindAddressbyZipCodeClient;
import com.gabriel.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressbyZipCodeClient client;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipcode) {
        var addressResponse = client.find(zipcode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
