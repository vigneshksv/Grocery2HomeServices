package com.startupprojects.grocery2home.products;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
		@Autowired
		private ProductRepository productRepository;

		public List<Product> getAllProducts() {
			List<Product> products = new ArrayList<>();
			productRepository.findAll().forEach(products::add);
			return products;
		}
		
		public Optional<Product> getProduct(int id) {
			return productRepository.findById(id);
			
		}
		public void addProducts(Product product) {
			productRepository.save(product);
		}
		public void updateProduct(Product product) {
			productRepository.save(product);
		}
		public void deleteProduct(int id) {
			productRepository.deleteById(id);
		}

}
