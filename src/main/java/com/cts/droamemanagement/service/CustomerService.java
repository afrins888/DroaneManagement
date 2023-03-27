package com.cts.droamemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.droamemanagement.domain.Customerdetails;
import com.cts.droamemanagement.repository.CustomerRepositoryIfc;
@Service
public class CustomerService {
	@Autowired
	private CustomerRepositoryIfc customerRepository;

	public List<Customerdetails> getAllCustomerdetails() {
		
		return customerRepository.findAll();
	}

	public String addNewCustomer(Customerdetails customer) {
		customerRepository.save(customer);
		return "saved" ;
	}

	public String deleteCustomer(Long id) {
		
		customerRepository.deleteById(id);
		return "deleted";
	}

}
