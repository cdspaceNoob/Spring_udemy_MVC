package kr.co.softcampus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.softcampus.beans.DataBean1;

@Controller
//@SessionAttributes("sessionBean1")	// 이 클래스 파일에서 sessionBean1이라는 이름으로 @ModelAttribute를 통해 주입받는 객체는 session 영역에 저장한다. 반드시 메서드를 같이 만들어 준다.
@SessionAttributes({"sessionBean1", "sessionBean2"})	// 여러 개일 때.	
public class TestController {

		@ModelAttribute("sessionBean1")
		public DataBean1 sessionBean1() {
			return new DataBean1();
		}
		
		@ModelAttribute("sessionBean2")
		public DataBean1 sessionBean2() {
			return new DataBean1();
		}
		
//	@GetMapping("/test1")
//	public String test1(HttpServletRequest req) {	// HttpServletRequest를 주입받는다. 
//		
//		HttpSession session = req.getSession();
//		session.setAttribute("data1", "문자열1");
//		 
//		return "test1";
//	}
	
	@GetMapping("/test1")
	public String test1(HttpSession session) {
		
		session.setAttribute("data1", "세션에 데이터1 생성");
		
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(HttpSession session) {
		
		session.setAttribute("data2", "세션에 데이터2 생성");
		
		return "redirect:/result1";
	}

	@GetMapping("/test3")
	public String test3(HttpSession session) {
		
		session.setAttribute("data3", "세션에 데이터3 생성");
		
		return "redirect:/result1";
	}
	
	@GetMapping("/test4")
	public String test4(HttpSession session) {
		
		DataBean1 bean1 = new DataBean1();
		bean1.setData1("문자열4");
		bean1.setData2("문자열5");
		
		session.setAttribute("bean1", bean1);
		
		return "test4";
	}
	
//	@GetMapping("/result4")
//	public String result4(HttpSession session) {
//		
//		DataBean1 bean1 = (DataBean1)session.getAttribute("bean1");
//		
//		System.out.printf("bean1.data1: %s\n", bean1.getData1());
//		System.out.printf("bean1.data2: %s\n", bean1.getData2());
//		
//		return "result4";
//	}
	
	@GetMapping("/result4")
	public String result4(@SessionAttribute("bean1") DataBean1 bean1) {
		
		System.out.printf("bean1.data1: %s\n", bean1.getData1());
		System.out.printf("bean1.data2: %s\n", bean1.getData2());
		
		return "result4";
	}
	
//	@GetMapping("/result1")
//	public String result1(HttpServletRequest req) {
//		
//		HttpSession session = req.getSession();
//		String data1 = (String)session.getAttribute("data1");
//		
//		System.out.printf("data1: %s\n", data1);
//		
//		return "result1";
//	}
	
	// Session 객체를 직접 주입받기. 
	@GetMapping("/result1")
	public String result1(HttpSession session) {
		
		String data1 = (String)session.getAttribute("data1");
		System.out.printf("data1: %s\n", data1);
		
		return "result1";
	}
	
	@GetMapping("/test5")
	public String test5(@ModelAttribute("sessionBean1") DataBean1 sessionBean1,
						@ModelAttribute("sessionBean2") DataBean1 sessionBean2) {	// @SessionAttribute로 설정되어 있는 이름들이므로 session 영역에 저장된다.
		
		sessionBean1.setData1("문자열6");
		sessionBean1.setData2("문자열7");
		
		sessionBean2.setData1("문자열8");
		sessionBean2.setData2("문자열9");
		
		return "test5";
	}
	
	@GetMapping("/result5")
	public String result5(@ModelAttribute("sessionBean1") DataBean1 sessionBean1,
						  @ModelAttribute("sessionBean2") DataBean1 sessionBean2) {	// @SessionAttribute로 설정되어 있는 이름들이므로 session 영역에 저장된다.
		
		System.out.printf("sessionBean1.data1: %s\n", sessionBean1.getData1());
		System.out.printf("sessionBean1.data2: %s\n", sessionBean1.getData2());
		
		System.out.printf("sessionBean1.data1: %s\n", sessionBean1.getData1());
		System.out.printf("sessionBean1.data2: %s\n", sessionBean1.getData2());
		
		return "result5";
	}
	
}
