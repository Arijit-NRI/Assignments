package com.mvcValidationDemo;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class EmpExceptionHandler {
	
	@ControllerAdvice
	public class EmpExceptionHanlder {
		
		@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(value=NullPointerException.class)
		public String exceptionHandler(Model m) {
			m.addAttribute("msg", "Null Pointer Exception has occurred");
			return "error";
		}
		
		@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(value=Exception.class)
		public String exceptionHandlerClass(Model m) {
			m.addAttribute("msg", "Some Exception has occurred");
			return "error";
		}
		

	}

}
