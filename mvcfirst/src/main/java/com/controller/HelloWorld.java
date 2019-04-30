package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Employee;

@Controller
public class HelloWorld {

	 @RequestMapping("/addUser")
	 public String helloWorld(@ModelAttribute("employee") Employee  employee,Model m)
	 {
		
		 //System.out.print(employee.getFirstname());
		 m.addAttribute("employee",employee);
		 return "disp";
	 }
	 
	 @RequestMapping("/")
	 public String helloWorld2()
	 {
		 		 return "index";
	 }
}
