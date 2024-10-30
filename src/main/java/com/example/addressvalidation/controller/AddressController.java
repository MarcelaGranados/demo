package com.example.addressvalidation.controller;

import com.example.addressvalidation.dto.AddressRequest;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class AddressController {

    @PostMapping("/validateAddress")
    public String validateAddress(@Valid @RequestBody AddressRequest addressRequest) {
        return "Dirección válida";
    }
}