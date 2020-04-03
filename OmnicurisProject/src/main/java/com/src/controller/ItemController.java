package com.src.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.src.Item.Item;
import com.src.exception.ItemException;
import com.src.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	ItemService service;

	@GetMapping("getall")
	public List<Item> getAllItem() {
		return service.getAllItem();

	}

	@GetMapping("get/{id}")
	public Item getById(@PathVariable("id") int id) throws ItemException {
		return service.getByid(id);
	}

	@PutMapping("update/{id}")
	public Item updateItem(@PathVariable("id") Integer id, @RequestBody Item item) throws ItemException {

		return service.updateItem(id, item);

	}

	@PostMapping("create")
	public long saveItem(@RequestBody Item item) {
		service.save(item);
		return item.getId();
	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteItem(@PathVariable("id") int id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}

}
