package com.springblog.exceptions;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyErrorDetails {
		
	private LocalDate timestamp;
	private String msg;
	private String details;
	
}
