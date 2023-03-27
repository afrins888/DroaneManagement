package com.cts.droamemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.droamemanagement.domain.Customerdetails;
import com.cts.droamemanagement.repository.CustomerRepositoryIfc;
import com.cts.droamemanagement.service.CustomerService;

@RestController
public class Customercontroller {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private CustomerRepositoryIfc customerRepository;
	@GetMapping(path="/rest/customer/getallcustomerdetails")
	public List <Customerdetails> getAllCustomerdetails(){
		List<Customerdetails> customerdetails = customerService.getAllCustomerdetails();
		return customerdetails;  
	}
	@PostMapping(path="/rest/customer/addnewcustomer")
	public  String  addNewCustomer(@RequestBody Customerdetails customer)  {

		return customerService.addNewCustomer(customer);

}
	@DeleteMapping(path="/rest/customer/deletecustomer/{id}")
	public  String  deleteCustomer(@RequestParam Long id) {

		return customerService.deleteCustomer(id);
}
}
