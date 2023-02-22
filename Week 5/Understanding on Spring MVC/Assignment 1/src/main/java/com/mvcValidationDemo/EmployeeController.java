package com.mvcValidationDemo;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class EmployeeController {

	
	@RequestMapping("/welcome")
	public String displayform(Model m)
	{
		m.addAttribute("emp", new Employee());
		return "viewform";
	}
	
	@RequestMapping("/submit")
	public String submitform(@Valid @ModelAttribute("emp") Employee emp,BindingResult br)
	{
		if(br.hasErrors())
		{
			return "viewform";
			
		}
		else {
			return "display";
		}
		
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandler(Model m)
	{
		m.addAttribute("msg", "Null Pointer Exception has occurred");
		return "error";
	}
}

