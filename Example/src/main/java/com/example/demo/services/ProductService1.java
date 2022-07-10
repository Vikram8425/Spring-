package com.example.demo.services;

import com.example.demo.Model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class ProductService1 {

	List<Product> list = new ArrayList<>();
    //create product
	public Product createProduct(Product product) {
		System.out.println(product.getProductName());
		list.add(product);
		return product;
	}

	// Get All Product From here
	public List<Product> getAllProducts() {

		return list;
	}

	// get Single product

	public Product getProduct(int productId) {

		Product product = list.stream().filter(p -> p.getProductId() == productId).findFirst().get();
		System.out.println(product.getProductName());

		return product;

	}
	// Delete Product
	public void deleteProduct(int pid) {
		
		list=list.stream().filter(p -> p.getProductId()!=pid).collect(Collectors.toList());
		
	}
	
	public Product updateProduct(int productId,Product newproduct) {
		
		list.stream().map(p -> {
			if(p.getProductId()==productId) {
				p.setProductName(newproduct.getProductName());
				p.setProductPrize(newproduct.getProductPrize());
				p.setProductDesc(newproduct.getProductDesc());
				p.setStock(newproduct.isStock());
				
				return p;
			}
			
			else
			return p;
			
		}).collect(Collectors.toList());
	
		return newproduct;
	}

}
