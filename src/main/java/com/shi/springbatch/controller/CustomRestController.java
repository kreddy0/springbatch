package com.shi.springbatch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shi.springbatch.model.Address;
import com.shi.springbatch.model.Customer;
import com.shi.springbatch.repository.AddressRepository;
import com.shi.springbatch.repository.CustomerRepository;

@RestController
@RequestMapping("/api")
public class CustomRestController {

	@Autowired
	AddressRepository adresRepo;
	
	@Autowired
	CustomerRepository customerRepo;
	
	@PostMapping("/addresses")
	public Address createAddress( @RequestBody Address address){
		return this.adresRepo.save(address);
	}
	
	@PostMapping("/customers")
	public Customer createCustomer(@RequestBody Customer customer ){
		return this.customerRepo.save(customer);
	}
}
