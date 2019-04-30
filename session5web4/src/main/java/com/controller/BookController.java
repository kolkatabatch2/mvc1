package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Book;

@Controller
public class BookController {

	@RequestMapping("/bookinsert")
	public String insert()
	{
		
		return "insert";
	}
	
	
	@RequestMapping("/bookdisplay")
	public String displayBook(@ModelAttribute("book") Book book,Model map)
	{
		map.addAttribute("book",book);
		return "dispb";
	}
}
