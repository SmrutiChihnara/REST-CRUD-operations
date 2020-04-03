package com.src.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.src.Item.Item;
import com.src.Item.Order;
import com.src.exception.ItemException;
import com.src.service.OrderService;

@RestController
public class ProductController {
	@Autowired
	OrderService service;
	@GetMapping("additem/{id}")
	public Item addItemInOrder(@PathVariable("id") int id,@RequestBody Order order ) throws ItemException
	{
	return	service .addItem(id,order);
	}

	@GetMapping("AllOrder")
	public List<Order> getAllorder()
	{
		return service.getAllOrder();
	}
}
