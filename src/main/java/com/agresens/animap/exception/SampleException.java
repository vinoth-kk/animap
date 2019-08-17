package com.agresens.animap.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.agresens.animap.Constant;

@ControllerAdvice(basePackages = "com.agresens.animap.controller")
public class SampleException {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Object> invalidInput(MethodArgumentNotValidException ex) {
		BindingResult result = ex.getBindingResult();
		return new ResponseEntity<Object>(fromBindingErrors(result), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<Object> requestHandlingNoHandlerFound(HttpRequestMethodNotSupportedException ex) {
		return new ResponseEntity<Object>(Constant.METHOD_NOT_SUPPORTED, HttpStatus.BAD_REQUEST);
	}

	private List<String> fromBindingErrors(Errors errors) {
		List<String> validErrors = new ArrayList<String>();
		for (ObjectError objectError : errors.getAllErrors()) {
			validErrors.add(objectError.getDefaultMessage());
		}
		return validErrors;
	}
}