package com.dao;

import java.util.List;

import com.model.Book;

public interface BookDAO {
public List<Book> getBookList();
public void addBook(Book book); 
}
