package com.shi.springbatch.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.shi.springbatch.model.Address;
import com.shi.springbatch.model.Customer;

public class RestClient {

	private static final Logger log =  LoggerFactory.getLogger(RestClient.class);
	
	
	private static final String CREATE_ADDRESS_BY_API="http://localhost:8080/api/addresses";
	
	private static final String CREATE_CUSTOMER_BY_API="http://localhost:8080/api/customers";
	
	static RestTemplate restTemplate = new RestTemplate();
	
	
	public static void callCreateAddressAPI(List<? extends Address> items){
		
		for(Address i :items){
		
			ResponseEntity<Address> address2= restTemplate.postForEntity(CREATE_ADDRESS_BY_API, i,Address.class);
		
			log.info("restclient ..." + address2.getBody());
		}
}

	public static void callCreateCustomerAPI(List<? extends Customer> items){
		
		for(Customer i :items){
		
			ResponseEntity<Customer> customer2= restTemplate.postForEntity(CREATE_CUSTOMER_BY_API, i,Customer.class);
		
			log.info("restclient ..." + customer2.getBody());
		}
}
	
}
