package com.pafProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class AppController {
	@Autowired
	private supplyerService service; 
	
	//@GetMapping("/product")
	// public String viewHomePage(Model model) {
	//	List<Product> listProducts = service.listAll();
		//model.addAttribute("listProducts", listProducts);
				
	//	   return "index";
	 //}
	
	@GetMapping("product")
	public List<supplyer> getAllProducts()
	{
		return service.listAll();
	}
	
}
