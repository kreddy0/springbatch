package com.shi.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shi.springbatch.model.Address;

public interface AddressRepository extends JpaRepository<Address,String> {

}
