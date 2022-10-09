package com.springblog.exceptions;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalexceptionHandler {
		
	@ExceptionHandler(NoPostfoundexception.class)
	public ResponseEntity<MyErrorDetails> NoPostfound(NoPostfoundexception npf, WebRequest req){
		MyErrorDetails myerror = new MyErrorDetails(LocalDate.now(), npf.getMessage(), req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(myerror, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoCommentFoundException.class)
	public ResponseEntity<MyErrorDetails> NoCommentfound(NoCommentFoundException ncf, WebRequest req){
		MyErrorDetails myerror = new MyErrorDetails(LocalDate.now(), ncf.getMessage(), req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(myerror, HttpStatus.BAD_REQUEST);
	}
}
