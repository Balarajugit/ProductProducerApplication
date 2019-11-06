package com.app.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Product;
import com.app.service.IProductService;

@RestController
public class ProductRestController {
	
	@Autowired
	private IProductService service;
	@PostMapping("/save")
	public String saveProduct(@RequestBody Product p) {
		
		service.saveProduct(p);
		return p.getName()+" : record inserted scussfully";
	}
	@GetMapping("/getone")
	public Product getById(@RequestParam Integer id) {
		Product p=service.getById(id);
		return p;
	}
	@DeleteMapping("/deleteone")
	public String deleteById(@RequestParam Integer id) {
		service.deleteById(id);
		return id+" : record deleted sucesfully";
	}
	

	@GetMapping("/all")
	public List<Product> getAllProducts(){
		List<Product> all=service.getAll();
		return all;
	}
}
