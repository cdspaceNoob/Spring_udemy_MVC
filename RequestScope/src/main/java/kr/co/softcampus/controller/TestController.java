package kr.co.softcampus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import kr.co.softcampus.beans.DataBean1;

@Controller
public class TestController {

	@GetMapping("/test1")
	public ModelAndView test1(ModelAndView mav, HttpServletRequest request) {
		
		request.setAttribute("data1", "문자열1");
		
		mav.setViewName("forward:/result1");	// redirect는 새로운 요청을 생성토록 하는 것이다. forward는 흐름을 이동하는 것이다.
		return mav;								// 따라서 기존 HttpServletRequest 객체는 소멸된다. 따라서 기존 객체는 유지된다. 
	}
	
	@GetMapping("/result1")
	public ModelAndView result1(ModelAndView mav, HttpServletRequest request) {

		String data1 = (String)request.getAttribute("data1");
		System.out.printf("data1: %s\n", data1);
		
		mav.setViewName("result1");
		return mav;
	}
	
	@GetMapping("/test2")
	public ModelAndView test2(ModelAndView mav, Model model) {	// Model은 Request 영역에 저장된다. 
	
		model.addAttribute("modelData2", "Model 문자열2");	// Request 객체에 저장.
//		mav.addObject("mavData2", "mav 문자열2");
		mav.setViewName("forward:/result2");
		
		return mav;
	}
	
//	@GetMapping("/result2")
//	public ModelAndView result2(Model model, ModelAndView mav, HttpServletRequest request) {
//		String modelStr = (String)model.getAttribute("modelData2");
//		String mavStr	= (String)request.getAttribute("mavStr");
//		
//		System.out.printf("modelStr: %s\n", modelStr);
//		System.out.printf("mavStr: %s\n", mavStr);
//		
//		model.addAttribute("modelStr", modelStr);
//		model.addAttribute("mavStr", mavStr);
//		
//		mav.addObject("modelStr", modelStr);
//		mav.addObject("mavStr", mavStr);
//		
//		mav.setViewName("result2");
//		return mav;
//	}
	
	@GetMapping("/result2")
	public String result2(Model model, HttpServletRequest request) {
		String data2 = (String)model.getAttribute("modelData2");	// 그러면 model.getAttribute()는 언제 어떻게 쓰는 거지??
		String rData2 = (String)request.getAttribute("modelData2");	// 그리고, mav에 붙인 건 어떻게 받는 거지??
		System.out.printf("modelData2: %s\n", data2);
		System.out.printf("rmodelData2: %s\n", rData2);
		
		return "result2";
	}
	
	@GetMapping("/test3")
	public ModelAndView test3(ModelAndView mav) {
		mav.addObject("data3", "문자열3");	// request 영역에 저장된다.
		mav.setViewName("forward:/result3");
		return mav;
	}
	
	@GetMapping("/result3")
	public ModelAndView result3(ModelAndView mav, HttpServletRequest request) {
		String data3 = (String)request.getAttribute("data3");
		System.out.printf("data3: %s\n", data3);
		mav.setViewName("result3");
		return mav;
	}
	
	@GetMapping("/test4")
	public String test4(Model model) {
		DataBean1 bean1 = new DataBean1();
		bean1.setData1("문자열4");
		bean1.setData2("문자열5");
		model.addAttribute("bean1", bean1);	// request 객체에 저장된다.
		return "forward:/result4";
	}
	
	@GetMapping("/result4")
	public String result4(HttpServletRequest request) {
		DataBean1 bean1 = (DataBean1)request.getAttribute("bean1");
		System.out.printf("bean1.data1: %s\n", bean1.getData1());
		System.out.printf("bean1.data2: %s\n", bean1.getData2());
		return "result4";
	}
	
	@GetMapping("/test5")
	public String test5(@ModelAttribute("bean1") DataBean1 bean1) {	// 여기서 새로운 bean1 객체를 생성한다.
		bean1.setData1("문자열6");
		bean1.setData2("문자열7");
		return "forward:/result5";
	}
	
	@GetMapping("/result5")
//	public String result5(@ModelAttribute("bean1") DataBean1 bean1) {	// 여기도 새로운 bean1 객체를 생성하면서 기존 bean1 객체는 소멸된다. 
	public String result5(HttpServletRequest request) {
		DataBean1 bean1 = (DataBean1) request.getAttribute("bean1");
		System.out.printf("bean1.data1: %s\n", bean1.getData1());
		System.out.printf("bean1.data2: %s\n", bean1.getData2());
		return "result5";
	}
	
	@GetMapping("/result6")
	public ModelAndView result6 (ModelAndView mav) {
		
		mav.addObject("data", "String data");
		
		mav.setViewName("result6");
		return mav;
	}
	
}
