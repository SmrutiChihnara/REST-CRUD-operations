package com.example.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoustomerControlle {
	@Autowired
	public CustomerService  service;
	
	@PostMapping("post")
	public Customer add(@RequestBody Customer customer)
	{
		return service.addCustomer(customer);
	}
	@GetMapping("getAll")
	public List<Customer> getcustomer()
	{
		return service.getCustomers();
	}
	@GetMapping(value = "/{id}")
	public Customer getByid(@PathVariable("id")  int id)
	{
		return service.getCustomer(id);
	}
	
	
	@PutMapping("/{id}")
	public Customer put(@PathVariable("id") int id,@RequestBody Customer customer)
	{
		return service.updateCustomer(customer, id);
	}
	
	
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") int id)
	{
		service .deleteCustomer(id);
	}

}
