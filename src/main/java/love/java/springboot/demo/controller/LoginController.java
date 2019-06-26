package love.java.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}

}
