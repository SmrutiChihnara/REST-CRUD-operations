package com.src.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.src.Item.Item;
import com.src.Item.Order;
import com.src.exception.ItemException;
import com.src.repository.ItemRepository;

public class OrderService {
List<Order> orderList=new ArrayList<Order>();
@Autowired
ItemRepository repository;
	public Item addItem(int id,Order order) throws ItemException {
		
		
		Item items = repository.findById(id).orElseThrow(() -> new ItemException(id));

		order.setId(items.getId());
		order.setGmail(items.getGmail());
	return	repository.save(items);
	
	}
	public List<Order> getAllOrder() {

		return orderList;
	}

}
