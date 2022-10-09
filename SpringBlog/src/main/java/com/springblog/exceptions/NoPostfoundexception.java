package com.springblog.exceptions;

@SuppressWarnings("serial")
public class NoPostfoundexception extends RuntimeException{
	
	public NoPostfoundexception() {
		
	}
	public NoPostfoundexception(String msg) {
		super(msg);
	}
}


