package com.shi.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shi.springbatch.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String>  {

}
