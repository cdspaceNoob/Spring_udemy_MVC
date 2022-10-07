package kr.co.softcampus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String[] data3 = request.getParameterValues("data3");
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		for(String str1 : data3) {
			System.out.println("data3: " + str1);
		}
		
		return "result";
	}
	
	@PostMapping("/test2")
	public String test2(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String[] data3 = request.getParameterValues("data3");
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		if(data3 != null) {
			for(String str : data3) {
				System.out.println("data3: " + str);
			}
		}
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(WebRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String[] data3 = request.getParameterValues("data3");
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		for(String str : data3) {
			System.out.println("data3: " + str);
		}
		return "result";
	}
	
	@GetMapping("/test4/{data1}/{data2}/{data3}/{data4}")	// 요청 주소의 마지막에 '/' 하나를 붙여 준다.
	public String test4(@PathVariable String data1, 
						@PathVariable String data2,
						@PathVariable String data3, 
						@PathVariable int data4) {		// 받는 값의 형변환도 가능하다.
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		System.out.println("data3: " + data3);
		System.out.println("data4: " + data4);
		
		int add = data4 + 345;
		System.out.println("add: " + add);
		
		return "result";
	}
	
	@GetMapping("/test5")
	public String test5(@RequestParam int data1,
						@RequestParam int data2,
						@RequestParam int[] data3) {
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		for(int num : data3) {
			System.out.println(num);
		}
		
		return "result";
	}
	
	@GetMapping("/test6")
	public String test6(@RequestParam(value="data1") int value1,
						@RequestParam(value="data2") int value2,
						@RequestParam(value="data3") int[] value3) {
		System.out.println("data1: " + value1);
		System.out.println("data2: " + value2);
		for(int i : value3) {
			System.out.println(i);
		}
		
		return "result";
	}
	
	@GetMapping("/test7")
	public String test7(@RequestParam int data1,		// 쿼리스트링과 파라미터의 이름이 일치하므로 자동 주입 가능 & 형변환까지
						@RequestParam (required = false)String data2) {	
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);

		return "result";
	}
	
}
