package com.pms.payrollapi.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException exception, HttpServletRequest request){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
				new StandardError(
						LocalDateTime.now(),
						exception.getMessage(), 
						HttpStatus.NOT_FOUND.value(), 
						request.getRequestURI())
				);
	}
}
