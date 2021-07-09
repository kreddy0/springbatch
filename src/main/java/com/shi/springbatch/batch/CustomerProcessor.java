package com.shi.springbatch.batch;

import java.io.File;

import java.io.FileWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.shi.springbatch.model.Customer;


@Component
public class CustomerProcessor implements ItemProcessor<Customer, Customer>{
 
	int count=0;
	 private static final Logger LOGGER = LoggerFactory.getLogger(CustomerProcessor.class);
	@Override
	public Customer process(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		count+=1;
		if(check(customer)){
		return customer;
	}
		return null;
	}

	private boolean check(Customer customer) {
		// TODO Auto-generated method stub
		if((customer.getPhone().length()==10) && checkFirstName(customer) && checkLastName(customer) && checkEmail(customer) && checkPhone(customer))
		{
		return true;
		}
		else{
			
			if(!(customer.getPhone().length()==10)){
				String s ="Phone number must be 10 digits "+ customer.getPhone();
				writ(s);
				LOGGER.error("Phone number must be 10 digits");
//				LOGGER.info("Phone number must be 10 digits");
			}
		return false;
	}
	

}

	private  boolean checkLastName(Customer customer) {
		// TODO Auto-generated method stub
		if(!customer.getLastName().isEmpty()){
			return true;
		}
		else{
			String s="Last Name is Empty";
			writ(s);
			LOGGER.error("Last Name is Empty");
			return false;
			
		}
	}

	

	private boolean checkPhone(Customer customer) {
		// TODO Auto-generated method stub
		try{
			Long  l = Long.parseLong(customer.getPhone());	
		}
		catch(NumberFormatException nfe){
			String s="Number must be Integer";
			writ(s);
			LOGGER.error("Number must be Integer");
			return false;
		}
		return true;
		
	}

	private boolean checkEmail(Customer customer) {
		// TODO Auto-generated method stub
		if(!customer.getEmail().isEmpty()){
		return true;
	}
	else{
		LOGGER.error("Last Email is Empty");
		String s="Last Email is Empty";
		writ(s);
		return false;
	}
}
	private boolean checkFirstName(Customer customer) {
		// TODO Auto-generated method stub
		if(!customer.getFirstName().isEmpty()){
			return true;
		}
		else{
			LOGGER.error("Last First Name is Empty");
			String s="Last First Name is Empty";
			writ(s);
			return false;
		}
	}
	
	private void writ(String s) {
		// TODO Auto-generated method stub
		try{
		File file = new File("error.csv");
		if(!file.exists())
		{file.createNewFile();
		}
		
		FileWriter writer = new FileWriter(file,true);
		
		writer.append("Contacts.csv"+","+count+","+s);
		writer.append('\n');
		writer.flush();
	     
		writer.close();
		}
		catch(Exception e){
			System.out.println(e.toString());
		}

		
	}
}