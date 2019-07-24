package com.demo.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.model.Book;
import com.demo.repository.BookRepository;

@Controller
public class MyController {

	
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Book book=(Book)context.getBean("book");
	BookRepository bookRepo=(BookRepository)context.getBean("bookrepo");
	@RequestMapping(value="/")
	public String display(Model model)
	{
		
		    List<Book> books=bookRepo.getBooks();
		    model.addAttribute("books",books);
		    return "disp";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@RequestParam("id") int id,@RequestParam("name") String name)
	{
		
		    Book book=new Book();
		    book.setId(id);
		    book.setName(name);
		    bookRepo.addBook(book);
		    return "redirect:/";
	}
	
}