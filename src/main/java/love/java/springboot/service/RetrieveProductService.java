package love.java.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import love.java.springboot.demo.dto.ProductDTO;
import love.java.springboot.demo.entity.Product_test;


@Service
public class RetrieveProductService {
	
	@Autowired
	ProductDTO productDTO;
	
	public Product_test retrieveAllProducts() {
		return productDTO.findByProductName("coconut");  
	}
	
	@Transactional
	public int updateProductStatus(String productStatus, String productName) {
		return productDTO.updateProductStatus(productStatus, productName);
	}

}
