package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import kr.co.softcampus.beans.UserDataBean;

@Controller
public class TestController {

	@GetMapping("/test1")
	public ModelAndView test1(ModelAndView mav, @ModelAttribute UserDataBean bean) {	// 어노테이션은 생략 가능하며 이름도 지정할 수 있다.
		// ModelAttribute를 실행할 때 request 객체에 어떤 이름으로 담을지는 결정하지 않았기 때문에, 데이터 타입 이름이 소문자 시작으로 들어가게 된다.
		
		bean.setUser_name("홍길동");
		bean.setUser_id("abcd");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address1("changwon, Korea");
		bean.setUser_address2("seongsan, Korea");
		
//		mav.addObject("bean", bean);	// ModelAttribute로 주입받은 객체는 자동으로 Request 객체에 담기므로 굳이 add하지 않아도 된다.
		mav.setViewName("test1");
		
		return mav;
	}
	
	@GetMapping("/test2")
	public ModelAndView test2(ModelAndView mav, UserDataBean bean) {	// @ModelAttribute는 생략 가능하다 
		
		bean.setUser_name("홍길동");
		bean.setUser_id("abcd");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address1("changwon, Korea");
		bean.setUser_address2("seongsan, Korea");
		
		mav.setViewName("test2");
		return mav;
	}

	@GetMapping("/test3")
	public ModelAndView test3(ModelAndView mav, @ModelAttribute("testBean") UserDataBean bean) {	// 이름을 정할 때는 @ModelAttribute 써야 한다. 
		
		bean.setUser_name("홍길동");
		bean.setUser_id("abcd");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address1("changwon, Korea");
		bean.setUser_address2("seongsan, Korea");
		
		mav.setViewName("test3");
		return mav;
	}
	
	@GetMapping("/test4")
	public String test4(Model model) {
		UserDataBean bean = new UserDataBean();
		bean.setUser_name("홍길동");
		bean.setUser_id("abcd");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address1("changwon, Korea");
		bean.setUser_address2("seongsan, Korea");
		model.addAttribute("test_user2", bean);
		return "test4";
	}
}
