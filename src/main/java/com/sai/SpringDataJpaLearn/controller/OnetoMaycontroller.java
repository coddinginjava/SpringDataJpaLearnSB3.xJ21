package com.sai.SpringDataJpaLearn.controller;

import com.sai.SpringDataJpaLearn.entity.onetomany.Address;
import com.sai.SpringDataJpaLearn.entity.onetomany.Customer;
import com.sai.SpringDataJpaLearn.service.SampleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
public class OnetoMaycontroller {

    private final SampleService service;

    @PostMapping("/1toMany/saveCustomer")
    public Customer saveCustomer(@RequestBody Customer customer){
        return service.saveCustomer(customer);
    }


    @GetMapping("/1toMany/getCust/{id}")
    public Customer getCustById(@PathVariable("id")UUID id){
        return service.gerCustomerById(id);
    }

    @GetMapping("/1toMany/getAdd/{id}")
    public Address getAdddById(@PathVariable("id")UUID id){
        return service.getAddressById(id);
    }
}
