package kr.co.softcampus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

// 여기서 어떤 방법을 사용할지는 개발자의 취향이다.
// 편한 거 하나 골라서 쓰면 된다.
// 기능 및 용도는 같기 때문이다.

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1() {
		
		return "test1";
	}
	
	@GetMapping("/test2")	// HttpServletRequest 사용.
	public String test2(HttpServletRequest request) {
		request.setAttribute("data1", 100);
		request.setAttribute("data2", 200);
		return "test2";
	}
	
	@GetMapping("/test3")	// Model 사용.
	public String test3(Model model) {	// spring이 request에 대해 model을 생성하고 여기에 넣어준다.
		
		model.addAttribute("data1", 300);
		model.addAttribute("data2", 400);	// 이렇게 model로 추가된 객체는 HttpServletRequest 객체에 담긴다.
											// 따라서 requestScope.이름 으로 출력하면 된다.
		return "test3";
	}
	
	@GetMapping("/test4")	// ModelAndView 사용.
	public ModelAndView test4(ModelAndView mav) {
		mav.addObject("data1", 500);
		mav.addObject("data2", 600);	// 이렇게 추가하는 것도 HttpServletRequest 객체에 담긴다.
		
		mav.setViewName("test4");
		
		return mav;
	}
		
}
