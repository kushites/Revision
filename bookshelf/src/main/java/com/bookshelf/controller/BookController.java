package com.bookshelf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookshelf.model.Book;
import com.bookshelf.service.Bookservice;

@RestController
public class BookController {
	
	@Autowired
	Bookservice bookservice;
	
	@GetMapping("/bookservice/books")
	public ResponseEntity<List<Book>> showAllBooks(){
		
		List<Book> list = bookservice.getAllBooks();
		return new ResponseEntity<List<Book>>(list, HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/bookservice/books/{id}")
	public ResponseEntity<Book> getbyid(@PathVariable Integer id){
		Book book =bookservice.getBook(id);
		
		return new ResponseEntity<Book>(book, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/bookservice/books")
	public ResponseEntity<Book> saveBook(@RequestBody Book book){
	Book book1= 	bookservice.saveBook(book);
	return new ResponseEntity<Book>(book1, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("bookservice/books/{id}")
	public ResponseEntity<Boolean> deletebyid(@PathVariable Integer id){
	Boolean flag =	bookservice.deleteBook(id);
	return new ResponseEntity<Boolean>(flag, HttpStatus.ACCEPTED);
	}
	
	@PutMapping("bookservice/books/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable Integer id, @RequestBody Book book ){
		Book book1 = bookservice.updateBook(id, book);
		return new ResponseEntity<Book>(book1, HttpStatus.ACCEPTED);
	}

}
