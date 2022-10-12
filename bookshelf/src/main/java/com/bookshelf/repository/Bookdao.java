package com.bookshelf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookshelf.model.Book;

public interface Bookdao extends JpaRepository<Book, Integer>{

}
