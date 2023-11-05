package com.customer.service;

import java.util.List;

import com.customer.entity.Customer;

public interface CustomerService {
	
	public Customer register(Customer customer);
	public List<Customer> getAllCustomer();
	public Customer getCustomer(Long id);
	public Customer updateCustomer(Customer customer);
	public void deleteCustomer(Long id);
	public void deleteAllCustomer();
}
