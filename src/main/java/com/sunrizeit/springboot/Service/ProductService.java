package com.sunrizeit.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunrizeit.springboot.Repository.ProductRepository;
import com.sunrizeit.springboot.entity.Product;

@Service
@Transactional
public class ProductService {
@Autowired
private ProductRepository repo;
public List<Product> listAll()
	{
		return repo.findAll();
	}
public void save(Product product) 
	{
		repo.save(product);
	}
public Product get(long id) 
	{
		return repo.findById(id).get();
	}
public void delete(long id) 
	{
		repo.deleteById(id);
	}
}
