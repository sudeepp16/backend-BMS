package com.example.demo;

import lombok.Data;

@Data
public class IdNotFoundException extends RuntimeException{
	
	public IdNotFoundException(String msg) {
		super(msg);
	}

}
