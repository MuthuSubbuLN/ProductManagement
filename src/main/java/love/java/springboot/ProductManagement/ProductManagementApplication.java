package love.java.springboot.ProductManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"love.java.springboot.demo.controller" , 
	"love.java.springboot.service" , 
	"love.java.springboot.demo.dto"})
@EntityScan("love.java.springboot.demo.entity")
@EnableJpaRepositories("love.java.springboot.demo.dto")

public class ProductManagementApplication extends SpringBootServletInitializer  {
	
	 @Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(ProductManagementApplication.class);
	    }

	public static void main(String[] args) {
		System.out.println("ProductManagementApplication entereing!!!!");
		SpringApplication.run(ProductManagementApplication.class, args);
	}

}
