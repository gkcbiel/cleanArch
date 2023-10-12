package com.gabriel.cleanarch.core.dataprovider;

import com.gabriel.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {
    Address find(final String zipCode);
}
