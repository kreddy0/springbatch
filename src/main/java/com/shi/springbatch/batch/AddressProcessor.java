package com.shi.springbatch.batch;

import java.io.File;
import java.io.FileWriter;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.shi.springbatch.model.Address;
import com.shi.springbatch.model.Customer;

@Component
public class AddressProcessor implements ItemProcessor<Address, Address>{

//	Customer customer;
	int count=0;
	
	@Override
	public Address process(Address address) throws Exception {
		// TODO Auto-generated method stub
		count+=1;
		if(check(address))
		return address;
		
	 return null;
		
	}

	private boolean check(Address address) {
		// TODO Auto-generated method stub
		if((address.getAddressType().equalsIgnoreCase("S")||address.getAddressType2().equalsIgnoreCase("S")) )
		return true;
		else{
			String s="Address Type does not have Shipping";
			writ(s);
			return false;
		}
	}

//	private boolean checkPhone(Address address) {
//		// TODO Auto-generated method stub
//		if(customer.getPhone().contains(address.getCustomerPhone()))
//		return true;
//		else{
//			String s="Phone number in address not matched with customer table";
//			writ(s);
//			return false;
//		}
//	}

	private void writ(String s) {
		
		// TODO Auto-generated method stub
		
		try{
			File file = new File("error.csv");
			if(!file.exists())
			{file.createNewFile();
			}
			
			FileWriter writer = new FileWriter(file,true);
			
			writer.append("Address.dat"+","+count+","+s);
			writer.append('\n');
			writer.flush();
		     
			writer.close();
			}
			catch(Exception e){
				System.out.println(e.toString());
			}
		
	}

}
