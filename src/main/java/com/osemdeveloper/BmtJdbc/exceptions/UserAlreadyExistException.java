package com.osemdeveloper.BmtJdbc.exceptions;

@SuppressWarnings("serial")
public class UserAlreadyExistException extends RuntimeException {

	public UserAlreadyExistException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public UserAlreadyExistException(String message) {
		super(message);
		
	}

}
