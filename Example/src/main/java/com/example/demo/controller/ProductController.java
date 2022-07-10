package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Product;
import com.example.demo.services.ProductService;
import com.example.demo.services.ProductService1;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductService productService;
	@PostMapping("/")
//	@RequestMapping(value = "/c", method = RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		
		Product createProduct = productService.createProduct(product);
		System.out.println("product-created");
		return createProduct;

	}

	@GetMapping("/")
	//@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Product> listAllProduct() {
		List<Product> allproduct = productService.getAllProducts();

		return allproduct;
	}
	
    @GetMapping("/{productId}")
	//@RequestMapping(value = "/get-product/{productId}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable int productId) {
		Product product = productService.getProduct(productId);

		return product;
	}
	  @DeleteMapping("/{productId}")
	//@RequestMapping(value="/deleteProduct/{productId}",method=RequestMethod.DELETE)
	public String deleteProduct(@PathVariable("productId") int pid) {
		
		    productService.deleteProduct(pid);
		     String a="Product "+pid+" is Deleted ";
		    return a;
	}
	  
	  @PutMapping("/{productId}")
	  public Product updateProduct(@PathVariable("productId") int productId,@RequestBody Product newproduct) {
		  
		  Product p=productService.updateProduct(productId,newproduct);
		  return p;
	  }

}
