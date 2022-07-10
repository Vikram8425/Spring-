package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.ProductDao;
import com.example.demo.Model.Product;
@Service
@Primary
public class ProductDaoServicesImp implements ProductService{
	
	@Autowired
	private ProductDao productDao;

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generate
		return productDao.saveProduct(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(int productId) {
		
		return productDao.getProductById(productId);
	}

	@Override
	public int deleteProduct(int pid) {
		// TODO Auto-generated method stub
		
		  int b=productDao.deleteById(pid);
		  
		 return b;
	}

	@Override
	public Product updateProduct(int productId, Product newproduct) {
		// TODO Auto-generated method stub
		return productDao.updateById(productId,newproduct);
		 
	}

}
