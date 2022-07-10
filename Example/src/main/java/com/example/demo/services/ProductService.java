package com.example.demo.services;

import java.util.List;

import com.example.demo.Model.Product;

public interface ProductService {
	public Product createProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProduct(int productId);
	public int deleteProduct(int pid);
	public Product updateProduct(int productId,Product newproduct);

}
