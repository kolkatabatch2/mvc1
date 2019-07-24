package com.service;
import java.util.*;
import com.model.*;

public class BookServiceImpl implements BookService{
List<Book> bookList=new ArrayList<Book>();

public List<Book> getBookList()
{
	return bookList;
	
}

public void addBook(Book book) {
	bookList.add(book);
	
}

}
