package com.startupprojects.grocery2home.products;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	@RequestMapping("/products/{id}")
	public Optional<Product> getProduct(@PathVariable int id) {
		return productService.getProduct(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/products")
	public void addProducts(@RequestBody Product product) {
		productService.addProducts(product);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/products")
	public void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/products/{id}")
	public void deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}

}
