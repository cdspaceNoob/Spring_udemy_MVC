package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller	// Controller로 쓰겠노라 설정.
public class TestController {
	
	@RequestMapping(value="/test01", method=RequestMethod.GET)
	public String test01() {
		return "test01";
	}
	
	@RequestMapping(value="/test02", method=RequestMethod.GET)
	public String test02() {
		return "test02";
	}
	
}
