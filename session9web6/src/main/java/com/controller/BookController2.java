package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Book;
import com.service.BookServiceImpl;

@Controller
public class BookController2 {
	BookServiceImpl bookService=new BookServiceImpl();

	@RequestMapping("/")
	public String insert(Model map)
	{
		
		List<Book> bookList=bookService.getBookList();
		map.addAttribute("booklist",bookList);
		return "insert";
	}
	
	
	@RequestMapping("/bookadd")
	public String displayBook(@ModelAttribute("book") Book book,Model map)
	{
		bookService.addBook(book);
		return "redirect:/";
	}
}
