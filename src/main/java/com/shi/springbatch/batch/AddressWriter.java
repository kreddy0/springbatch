package com.shi.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shi.springbatch.model.Address;
import com.shi.springbatch.repository.AddressRepository;

@Component
public class AddressWriter implements ItemWriter<Address> {
	
	@Autowired
	AddressRepository addressRepo;

	@Override
	public void write(List<? extends Address> addressWriter) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Data saved for Address: "+ addressWriter );
		
		addressRepo.saveAll(addressWriter);
	}

}
