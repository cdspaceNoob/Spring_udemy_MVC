package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sub02")	// 두 번째 경로(첫 번째 하위 경로 설정) 설정.
public class Sub02Controller {
	
	// 따라서 여기부터 지정되는 경로는 세 번째 경로(두 번째 하위 경로)로 설정된다.
	@RequestMapping(value="/test05", method=RequestMethod.GET)
	public String test05() {
		return "sub02/test05";
	}
	
	@RequestMapping(value="/test06", method=RequestMethod.GET)
	public String test06() {
		return "sub02/test06";
	}
	
}
