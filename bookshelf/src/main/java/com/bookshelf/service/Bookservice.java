package com.bookshelf.service;

import java.util.List;

import com.bookshelf.exception.NoBookFound;
import com.bookshelf.model.Book;

public interface Bookservice {
	
	public List<Book> getAllBooks() throws NoBookFound;
	
	public Book getBook(int id) throws NoBookFound;
	
	public Book saveBook(Book book);
	
	public boolean deleteBook(int id);
	
	public Book updateBook(int id, Book book);

}
