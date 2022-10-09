package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1() {
		// 여기서 클라이언트에게 sub1을 요청하라는 응답을 보낸다.
		return "redirect:/sub1";	/* /sub1 주소로 다시 요청해라. */
	}
	
	@GetMapping("/sub1")
	public ModelAndView sub1(ModelAndView mav) {
		
		mav.setViewName("sub1");	
		return mav;
	}
	
	@GetMapping("/test2")
	public ModelAndView test2(ModelAndView mav) {
		mav.setViewName("forward:/sub2");	// viewName은 결국 앞뒤 경로를 제거한 jsp 파일의 이름을 써주는 것이다.
		return mav;
	}
	
	@GetMapping("/test3")
	public ModelAndView test3(ModelAndView mav) {
		mav.setViewName("redirect:/sub2");
		return mav;
	}
	
	@GetMapping("/sub2")
	public String sub2(){
		return "sub2";
	}
	
}
