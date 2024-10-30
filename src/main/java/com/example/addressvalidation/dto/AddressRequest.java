package com.example.addressvalidation.dto;

import com.example.addressvalidation.validation.ValidAddress;
import jakarta.validation.constraints.NotBlank;

public class AddressRequest {

    @NotBlank(message = "La dirección no puede estar vacía")
    @ValidAddress
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
