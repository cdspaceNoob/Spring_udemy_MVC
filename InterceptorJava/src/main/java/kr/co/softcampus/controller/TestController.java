package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1() {
		System.out.println("test1 경로의 test1 메서드 실행.");
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2() {
		System.out.println("test2 경로의 test2 메서드 실행.");
		return "test2";
	}
	
	@GetMapping("/sub1/test3")
	public String test3() {
		System.out.println("/sub/test3 경로의 test3 메서드 실행.");
		return "test3";
	}
	
	@GetMapping("/sub1/test4")
	public String test4() {
		System.out.println("/sub/test4 경로의 test4 메서드 실행.");
		return "test4";
	}
	
}
