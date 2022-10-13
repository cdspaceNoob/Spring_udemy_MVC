package kr.co.softcampus.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.softcampus.beans.DataBean;
import kr.co.softcampus.beans.DataBean2;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1(HttpServletRequest request, @RequestParam Map<String, String> map, @RequestParam List<String> data3) {
		// 이전까지는 파라미터를 주입받을 매개변수를 설정했었다.
		// 하지만 객체 형태(여기서는 Map)으로도 받을 수 있다.
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		String data33 = map.get("data3");
		String[] data333 = request.getParameterValues("data3");
		
		System.out.printf("data1: %s\n", data1);
		System.out.printf("data2: %s\n", data2);
		System.out.printf("data33: %s\n", data33);
		for(String str : data3) {
			System.out.printf("data3: %s\n", str);
		}
		for(String str : data333) {
			System.out.printf("data333: %s\n", str);
		}
		
		return "result";
	}
	
	@GetMapping("/test2")
//	public String test2(@ModelAttribute DataBean bean1, @ModelAttribute DataBean2 bean2) {	// @ModelAttribute는 생략 가능하다.
	public String test2(DataBean bean1, DataBean2 bean2) {
		System.out.printf("data1.1 : %d\n", bean1.getData1());
		System.out.printf("data1.2 : %d\n", bean1.getData2());
		
		System.out.printf("data2.1 : %d\n", bean2.getData1());
		System.out.printf("data2.2 : %d\n", bean2.getData2());
		
		for(int i : bean1.getData3())
		System.out.printf("data3 : %d\n", i);
		
		return "result";
	}
	
}
