package com.bookshelf.exception;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class MyErrorDetails {
	
	LocalDate timestamp;
	
	String message;
	
	String descrription;

}
