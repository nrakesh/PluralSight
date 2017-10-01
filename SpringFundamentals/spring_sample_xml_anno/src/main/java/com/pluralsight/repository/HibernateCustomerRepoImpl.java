package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepoImpl implements CustomerRepo {
	
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepo#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer c = new Customer();
		c.setFirstName("Rakesh");
		c.setLastName("Nair");
		customers.add(c);
		return customers;
	}
 
}
