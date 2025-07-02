package com.example.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.northwind.entities.concretes.*;

public interface ProductDao extends JpaRepository<Product , Integer>{

}
