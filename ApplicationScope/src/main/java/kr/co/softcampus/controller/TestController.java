package kr.co.softcampus.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softcampus.beans.DataBean1;

@Controller
public class TestController {
	
	@Autowired
	ServletContext app;

	@GetMapping("/test1")
//	public String test1(HttpServletRequest req) {	// Controller에서 type을 통해 ServletContext를 주입받았다.
	public String test1() {
		
		DataBean1 bean1 = new DataBean1();
		bean1.setData1("data1입니다");
		bean1.setData2("data2입니다");
		
//		ServletContext app = req.getServletContext();
		app.setAttribute("bean1", bean1);
		app.setAttribute("appScope", "서버 영역에서 사용하는 자료입니다.");
		
		return "test1";
	}
	
	@GetMapping("/result1")
//	public String result1(HttpServletRequest req) {	// Controller에서 type을 통해 ServletContext를 주입받았다.
	public String result1() {

//		ServletContext app = req.getServletContext();
		String data = (String)app.getAttribute("appScope");
		
		System.out.println(data);
		
		DataBean1 bean1 = (DataBean1)app.getAttribute("bean1");
		System.out.printf("bean1.data1: %s\n", bean1.getData1());
		System.out.printf("bean1.data2: %s\n", bean1.getData2());
		
		return "result1";
	}
	
}
