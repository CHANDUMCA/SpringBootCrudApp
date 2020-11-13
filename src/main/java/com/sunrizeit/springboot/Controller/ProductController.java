package com.sunrizeit.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunrizeit.springboot.Service.ProductService;
import com.sunrizeit.springboot.entity.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductService	service;
	
	@RequestMapping("/")
	public String viewHomepage(Model model) {
		List<Product> listProducts=service.listAll();
		model.addAttribute("listProducts", listProducts);
		return "index";
	}
	@RequestMapping("/new")
	public String showNewProductpage(Model model) {
		Product product=new Product();
		model.addAttribute(product);
		return "new_product";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		service.save(product);
		return "redirect:/";
	}
	

}
