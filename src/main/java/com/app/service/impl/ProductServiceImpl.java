package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Product;
import com.app.repo.ProductRepository;
import com.app.service.IProductService;
@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductRepository repo;

	@Transactional
	public void saveProduct(Product p) {
		Integer count=p.getCount();
		double cost=p.getBaseCost();
		double baseCost=count*cost;
		double gst=baseCost*(5/100.0);
		double disc=baseCost*(13/100.0);
		
		p.setBaseCost(baseCost);
		p.setGst(gst);
		p.setDiscount(disc);
		p.setFinelCost(baseCost+gst-disc);
		
		repo.save(p);
		
	}

	@Transactional(readOnly = true)
	public Product getById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Product> byId = repo.findById(id);
		if(byId.isPresent()) {
			return byId.get();
		}
		return null;
	}
	
	@Transactional
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}
	
	@Transactional(readOnly = true)
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	

}
