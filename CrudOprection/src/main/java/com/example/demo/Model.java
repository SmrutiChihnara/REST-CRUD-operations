package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Model {

	private int id;
	public int getId() {
		return id;
	}
	public Model() {
		super();
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Model(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private String name;

}
