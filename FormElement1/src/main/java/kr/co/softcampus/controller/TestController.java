package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.softcampus.beans.DataBean1;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public ModelAndView test1(ModelAndView mav, DataBean1 bean) {	//@ModelAttribute 생략.
		
		bean.setA1("data1");
		bean.setA2("data2");
		bean.setA3("data3");
		bean.setA4("data4");
		
		mav.setViewName("test1");
		return mav;
	}
	
}
