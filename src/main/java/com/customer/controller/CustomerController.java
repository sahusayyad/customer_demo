package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.Customer;
import com.customer.serviceimpl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	@PostMapping("/register")
	public Customer register(@RequestBody Customer customer) {
		return this.customerServiceImpl.register(customer);
	}
	
	@GetMapping("/all_customer")
	public List<Customer> getAllCustomer(){
		return this.customerServiceImpl.getAllCustomer();
	}
	
	@GetMapping("/get_customer/{id}")
	public Customer getCustomer(@PathVariable Long id) {
		return this.customerServiceImpl.getCustomer(id);
	}
	
	@PutMapping("/update_customer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return this.customerServiceImpl.updateCustomer(customer);
	}
	
	@DeleteMapping("/delete_customer/{id}")
	public void deleteCustomer(@PathVariable Long id) {
		this.customerServiceImpl.deleteCustomer(id);
	}
	
	@DeleteMapping("delete_all_customer")
	public void deleteAllCustomer() {
		this.customerServiceImpl.deleteAllCustomer();;
	}

}
