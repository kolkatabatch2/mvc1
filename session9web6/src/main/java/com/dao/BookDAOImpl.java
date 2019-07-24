package com.dao;

import java.util.List;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Book;

public class BookDAOImpl implements BookDAO {
    @Autowired
	private SessionFactory sessionFactory;
	public List<Book> getBookList() {
	Query criteria=sessionFactory.getCurrentSession().createQuery("from Book");
	List<Book> list=criteria.list();
	return list;
	}

	public void addBook(Book book) {
		sessionFactory.getCurrentSession().persist(book);

	}

}
