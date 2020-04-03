package com.src.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.src.Item.Item;
import com.src.exception.ItemException;
import com.src.repository.ItemRepository;
@Service
public class ItemService {
	private ItemRepository repository;

	public List<Item> getAllItem() {

		List<Item> item = new ArrayList<Item>();
		repository.findAll().forEach(items -> item.add(items));

		return item;

	}

	public Item getByid(int id) throws ItemException {

		return repository.findById(id).orElseThrow(() -> new ItemException(id));
	}

	public Item updateItem(Integer id, Item item) throws ItemException {

		Item items = repository.findById(id).orElseThrow(() -> new ItemException(id));

		items.setId(item.getId());
		items.setName(item.getName());
		items.setGmail(item.getGmail());
		items.setPrice(item.getPrice());

		Item updateItem = repository.save(item);
		return updateItem;

	}

	public void delete(int id) {
		repository.deleteById(id);
	}

	public void save(Item item) {

		repository.save(item);

	}

}
