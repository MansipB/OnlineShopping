package com.shopping.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class WrongCredentialsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public WrongCredentialsException() {
		super("Wong Credentials Provided");
	}
}
