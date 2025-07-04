package com.example.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.northwind.business.abstracts.ProductService;
import com.example.northwind.dataAccess.abstracts.ProductDao;
import com.example.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{
	
	private ProductDao productDao;

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.findAll();
	}

	@Autowired
	public ProductManager(ProductDao productdao,ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
 
}
