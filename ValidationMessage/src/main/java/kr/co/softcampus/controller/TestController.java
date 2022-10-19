package kr.co.softcampus.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softcampus.beans.DataBean1;

@Controller
public class TestController {

	@GetMapping("input_data")
	public String input_data() {
		return "input_data";
	}
	
	@PostMapping("input_pro")
	public String input_pro(@Valid DataBean1 dataBean1, BindingResult result) {	 
	// @ModelAttribute로 DataBean1 타입을 dataBean1로 받아서 @Valid로 유효성 검사.
	// @ModelAttribute로 받았기 때문에 Request 객체 안에 dataBean1이 담겨 있다. 
		
		if(result.hasErrors()) {
			System.out.println("입력에 오류가 있습니다.");
			return "input_data";
		}
		System.out.println("규칙에 맞는 입력입니다.");
		return "input_success";
	}
}
