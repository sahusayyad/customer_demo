package com.customer.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.Customer;
import com.customer.repositor.CustomerRepository;
import com.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer register(Customer customer) {
		return this.customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return this.customerRepository.findAll();
	}

	@Override
	public Customer getCustomer(Long id) {
		return this.customerRepository.findById(id).get();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return this.customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(Long id) {
		this.customerRepository.deleteById(id);
	}

	@Override
	public void deleteAllCustomer() {
		this.customerRepository.deleteAll();
	}

}
