package love.java.springboot.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import love.java.springboot.demo.entity.Product_test;

@Repository
public interface ProductRepository extends CrudRepository<Product_test, Integer> {
	
	

}
