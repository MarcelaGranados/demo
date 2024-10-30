package com.example.addressvalidation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AddressValidator implements ConstraintValidator<ValidAddress, String> {
    @Override
    public boolean isValid(String address, ConstraintValidatorContext context) {
        if (address == null || address.isEmpty()) {
            return false;
        }
        // Modificada para incluir # y - en la dirección
        return address.matches("^[\\w\\s#-]+,\\s[\\w\\s]+,\\s\\d{5}$");
    }
    
}
