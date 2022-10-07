package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.softcampus.beans.DataBean1;

@Controller
public class TestController {
	
	@PostMapping("/test1")
//	public ModelAndView test1(ModelAndView mav, @ModelAttribute DataBean1 bean) { // @ModelAttribute는 생략 가능하다.
	public ModelAndView test1(ModelAndView mav, DataBean1 bean) {
//		System.out.printf("data1: %s\n", bean.getData1());
//		System.out.printf("data2: %s\n", bean.getData2());
		// DataBean1 타입으로 주입받아 bean이라는 이름의 객체를 생성하긴 했을 때 HttpServletRequest 객체에 담기는 이름은 소문자로 시작하는 타입 이름이 된다.
		mav.setViewName("test1");
		return mav;
	}
	
	@PostMapping("/test2")
	public ModelAndView test2(ModelAndView mav, @ModelAttribute("testData") DataBean1 bean) {	// HttpServletRequest에 담을 이름을 설정 가능.
		mav.setViewName("test2");
		return mav;
	}
}
