package com.app.service;

import java.util.List;

import com.app.model.Product;

public interface IProductService {
	
	public void saveProduct(Product p);
	
	public Product getById(Integer id);
	
	public void deleteById(Integer id);
	
	public List<Product> getAll();

}
