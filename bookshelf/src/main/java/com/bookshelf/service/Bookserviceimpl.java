package com.bookshelf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshelf.exception.NoBookFound;
import com.bookshelf.model.Book;
import com.bookshelf.repository.Bookdao;

@Service
public class Bookserviceimpl implements Bookservice{
	
	@Autowired
	Bookdao bookdao;

	@Override
	public List<Book> getAllBooks() throws NoBookFound {
		List<Book> list = bookdao.findAll();
		if(list==null) {
			throw new NoBookFound("no book found");
		}
		return list;
		
	}

	@Override
	public Book getBook(int id) throws NoBookFound {
		Optional<Book> book = bookdao.findById(id);
		if(book.isEmpty()) {
			throw new NoBookFound("no book found");
		}
		return book.get();
	}

	@Override
	public Book saveBook(Book book) {
		return bookdao.save(book);
		
	}

	@Override
	public boolean deleteBook(int id) {
		Optional<Book> book = bookdao.findById(id);
		if(book.isEmpty()) {
			return false;
		}
		bookdao.deleteById(id);
		return true;
	}

	@Override
	public Book updateBook(int id, Book book) {
		Optional<Book> opt = bookdao.findById(id);
		if(opt.isEmpty()) {
			throw new NoBookFound("no book found to update");
		}
		book.setId(opt.get().getId());
		return bookdao.save(book);
		
	}

}
