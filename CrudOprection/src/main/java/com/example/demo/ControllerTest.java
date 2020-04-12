package com.example.demo;

import java.util.List;
import java.util.Map;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.sun.research.ws.wadl.Application;

@RestController
public class ControllerTest {

	@Autowired
	ServiceTest service;
	@GetMapping("/get")
	public Map<Integer, Model> getAll()
	{
		return service.getAll();
	}
	@DeleteMapping("delete/{id}")
	public String getDelete(@PathVariable("id") int id)
	{
		return service.delete(id);
	}
	
	@PostMapping("/post")
	@Produces(MediaType.APPLICATION_JSON)
	public Model getPost( Model model)
	{
		return service.update(model);
	}
	 

	
}
