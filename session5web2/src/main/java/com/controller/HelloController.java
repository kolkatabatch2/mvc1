package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.model.Hello;
@Controller
public class HelloController {
	@RequestMapping("/")
	public String hello(Model model)
	{
		Hello hello=new Hello();
		hello.setGreet("Hello Friends");
		model.addAttribute("hello",hello);
		return "hello";
	}
}
