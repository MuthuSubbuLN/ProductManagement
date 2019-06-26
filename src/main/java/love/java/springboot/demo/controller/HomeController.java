package love.java.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import love.java.springboot.demo.dto.ProductDTO;
import love.java.springboot.demo.entity.Product_test;
import love.java.springboot.service.RetrieveProductService;

@Controller
@RequestMapping("/prodmanagement")
public class HomeController {

	@Autowired RetrieveProductService service;
	@Autowired  ProductDTO prodRepos;

	@RequestMapping(method = RequestMethod.GET, value = "/loadAll")
	//@ResponseBody - not required while returning ModelAndView
	public ModelAndView loadData() {

		
		/* Every time this line creates a new row
		 * prodRepos.save(new Product_test("Apple", 30, 1000, "active"));
		 */
		
		/*Permission issue - hence commented out
		 * service.updateProductStatus("in-active", "coconut");
		 */
		ModelAndView modelAndView = new ModelAndView("home");

		Product_test product = service.retrieveAllProducts();
		System.out.println("halfway !!! -- > " + product);
		//modelAndView.addObject("product", product);
		
		modelAndView.addObject("products", prodRepos.findAll());
		
		return modelAndView;

		// return service.retrieveAllProducts();

	}
}
