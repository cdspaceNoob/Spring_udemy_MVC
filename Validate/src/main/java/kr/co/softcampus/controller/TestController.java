package kr.co.softcampus.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import kr.co.softcampus.beans.DataBean1;

@Controller
public class TestController {

	@GetMapping("/input_data")
	public String input_data(String data1) {
		
		
		return "input_data";
	}
	
	@PostMapping("/input_pro")
	public String input_pro(@Valid DataBean1 dataBean1, BindingResult result) {	// result는 request 객체에 errors라는 이름으로 담긴다.  
		
		System.out.printf("data1: %s\n", dataBean1.getData1());
		System.out.printf("data2: %d\n", dataBean1.getData2());
		
		System.out.printf("BindingResult: %s\n", result);
		
		if(result.hasErrors()) {
			// 유효성 검사 결과 모두 가져오기 
			for(ObjectError obj : result.getAllErrors()) {	// ObjectError 객체를 리스트로 가져와서 하나하나 꺼낸다.
				System.out.println("--------------------------------------------");
				System.out.printf("메시지: %s\n", obj.getDefaultMessage());
				System.out.printf("code: %s\n", obj.getCode());
				System.out.printf("object name: %s\n", obj.getObjectName());
				
				String[] codes = obj.getCodes();	// Code's'는 Bean과 property 이름, 위반 Annotation 이름이 들어있다. 
				for(String c1: codes) {
					System.out.println(c1);
				}
				
				// 
				if(codes[0].equals("Size.dataBean1.data1")) {
					System.out.println("두 글자에서 열 글자 사이만 담을 수 있습니다.");
				} else if(codes[0].equals("Max.dataBean1.data2")) {
					System.out.println("100이하의 값만 담을 수 있습니다.");
				}
				
				System.out.println("--------------------------------------------");
			}
			return "input_data";
		}
		return "input_success";
	}
	
}
