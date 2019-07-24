package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Book;

public class BookRepository {

	private List<Book> books=new ArrayList<Book>();
	public BookRepository() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Book> getBooks()
	{
		return books;
	}
	
	public Book addBook(Book book)
	{
		books.add(book);
		return book;
	}
}
