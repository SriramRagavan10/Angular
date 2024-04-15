package com.directors.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<Object> nullPointer(NullPointerException ne) {
		return new ResponseEntity<>(ne.getMessage(), HttpStatus.BAD_REQUEST);
	}

}
