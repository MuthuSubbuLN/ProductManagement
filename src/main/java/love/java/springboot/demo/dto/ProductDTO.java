package love.java.springboot.demo.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import love.java.springboot.demo.entity.Product_test;


@Repository
//@Service

public interface  ProductDTO extends JpaRepository<Product_test, Long> , CrudRepository<Product_test, Long>{

	Product_test findByProductName(String productName);

	@Modifying
	@Query(value = "update table product_test set prd_status = ? where prd_name = ?", nativeQuery = true)
	int updateProductStatus(String productStatus, String productName);
	
	
}
