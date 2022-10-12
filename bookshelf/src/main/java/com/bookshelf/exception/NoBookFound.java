package com.bookshelf.exception;

public class NoBookFound extends RuntimeException {
	
	public NoBookFound() {
		
	}
	
	public NoBookFound(String msg) {
		super(msg);
	}
	

}
