package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public class ServiceTest {

	
 private static Map<Integer, Model> map;
 static 
 {
	// Model model = new Model();
	 map = new HashMap<Integer, Model>();
	 map.put(1,new Model(101, "smruti"));
	 map.put(2,new Model(102, "ranjan"));
	 map.put(3,new Model(103, "ch"));
	 
 }
	
	public Map<Integer, Model> getAll() {
		// TODO Auto-generated method stub
		List  list = new ArrayList<Model>(map.values());
		return map;
	}

	public String  delete(int id) {
		 map.remove(id);
		return " data has been deleted ";
	}

	public Model update(Model model) {
		
		map.put(model.getId(), model);
		
		// TODO Auto-generated method stub
		return model;
	}

}
