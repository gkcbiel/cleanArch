package com.gabriel.cleanarch.entrypoint.controller.request;

import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private String cpf;

    private Boolean isValidCpf;

    private AddressResponse address;

}
