package com.yash.pms.service;

import java.util.List;

import com.yash.pms.model.Product;


public interface ProductService {
	
	public List<Product> getDetails();
	public Product getDetailsById(int id);
	public Product save(Product data);
	public Product delete(int delid);
	

}
