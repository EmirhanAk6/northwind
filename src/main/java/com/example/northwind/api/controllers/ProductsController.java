package com.example.northwind.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.northwind.business.abstracts.ProductService;
import com.example.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	
	private ProductService productService;
	
	public ProductsController(ProductService productservice) {
		super();
		this.productService = productservice;
	}

	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
}
}
