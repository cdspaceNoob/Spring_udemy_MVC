package kr.co.softcampus.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(java.lang.NullPointerException.class)
	public String handleException() {
		return "error2";
	}
}
