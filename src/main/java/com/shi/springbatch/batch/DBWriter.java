package com.shi.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.shi.springbatch.controller.RestClient;
import com.shi.springbatch.model.Customer;

@Component
public class DBWriter implements ItemWriter<Customer> {

//	@Autowired
//	CustomerRepository customerRepo;

	
	@Override
	public void write(List<? extends Customer> customers) throws Exception {
		// TODO Auto-generated method stub
		
		//System.out.println("Data saved for Customers: "+ customers );
		//customerRepo.saveAll(customers);//save
		
		RestClient.callCreateCustomerAPI(customers);
		
	}
	
	
}
