package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepo;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepo customerRepo;
	public CustomerServiceImpl() {
		super();
	}
	
	public CustomerServiceImpl(CustomerRepo customerRepo) {
		super();
		this.customerRepo = customerRepo;
	}
	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
	public void setCustomerRepository(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}
}
