package com.example.addressvalidation.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AddressValidator.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidAddress {
    String message() default "Dirección inválida";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
