package com.example.customer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Service;
@Service
public class CustomerService {

	List<Customer> customerList = new CopyOnWriteArrayList<Customer>();

	int customerid = 1;

	public Customer addCustomer(Customer customer) {
		customer.setCustomerId(customerid);
		customerList.add(customer);
		customerList.add(customer);
		customerid++;
		return customer;

	}

	public List<Customer> getCustomers() {
		return customerList;
	}

	public Customer getCustomer(int id) {
		return customerList.stream().filter(c -> c.getCustomerId() == id).findFirst().get();
	}

	public Customer updateCustomer(Customer customer, int id) {
		customerList.stream().forEach(c -> {

			if (c.getCustomerId() == id) {
				c.setFristName(customer.getFristName());
				c.setLastName(customer.getLastName());
			}

		}

		);
		return customerList.stream().filter(c -> c.getCustomerId() == id).findFirst().get();

	}
	
	
	public void deleteCustomer(int id)
	{
		customerList.stream().forEach(c->
		{
			if(c.getCustomerId()==id)
			{
				customerList.remove(c);
			}
			
		});
	}

}
