package com.yash.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import com.yash.pms.model.Product;
import com.yash.pms.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService product;
	
	public List<Product> getDetails()
		{
			return this.product.getDetails();
		}
	
	public Product getDetailsById(int id)
		{
			return this.product.getDetailsById(id);
		}
	public Product addDetails(Product data)
		{
			return this.product.save(data);
		}
	public Product delDetails(int id)
		{
			return this.product.delete(id);
		}

}
