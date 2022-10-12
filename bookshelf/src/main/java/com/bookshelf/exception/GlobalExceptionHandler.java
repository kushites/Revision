package com.bookshelf.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.bookshelf.model.Book;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(NoBookFound.class)
	public ResponseEntity<MyErrorDetails> Nobookfound(NoBookFound nbf, WebRequest req){
		
		MyErrorDetails err = new MyErrorDetails(LocalDate.now(), nbf.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.ACCEPTED);
	}

}
