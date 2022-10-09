package com.springblog.exceptions;

@SuppressWarnings("serial")
public class NoCommentFoundException extends RuntimeException{

	public NoCommentFoundException(String message) {
		super(message);
		
	}
	
	public NoCommentFoundException() {
		
	}
				
}
