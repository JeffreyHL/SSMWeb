package helloWorld.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class HelloController {       

	@RequestMapping(value="/index")  
   public String hello(){  
       System.out.println("spring mvc hello world!");  
       return "index";  
   }  
}  