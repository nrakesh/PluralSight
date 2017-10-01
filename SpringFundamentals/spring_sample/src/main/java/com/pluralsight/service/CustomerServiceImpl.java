package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepo;
import com.pluralsight.repository.HibernateCustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepo customerRepo = new HibernateCustomerRepoImpl();
	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
}
