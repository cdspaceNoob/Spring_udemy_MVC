package kr.co.softcampus.controller;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/save_cookie")
	public String save_cookie(HttpServletResponse resp) {	// 응답할 때 던져줘야 하니까 응답 객체를 주입받는다. 
		
		try {
			String data1 = URLEncoder.encode("문자열1", "UTF-8");
			String data2 = URLEncoder.encode("문자열2", "UTF-8");
			
			Cookie cookie1 = new Cookie("cookie1", data1);
			Cookie cookie2 = new Cookie("cookie2", data2);
			
			cookie1.setMaxAge(365 * 24 * 60 * 60);	// sec단위.
			cookie2.setMaxAge(365 * 24 * 60 * 60);
		
			resp.addCookie(cookie1);
			resp.addCookie(cookie2);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return "save_cookie";
	}
	
	// 일반적인 방법 
	@GetMapping("/load_cookie")
	public String load_cookie(HttpServletRequest req) {	// 들어오는 요청으로부터 쿠키 내용을 읽어야 하니까 요청 객체를 주입받는다. 
		
		try {
			
			Cookie[] cookies = req.getCookies();
			
			// cookie 선별하기
			for(Cookie cookie : cookies) {
				String str = URLDecoder.decode(cookie.getValue(), "UTF-8");
				
				if(cookie.getName().equals("cookie1")) {
					System.out.printf("cookie1: %s\n", str);
				} else if(cookie.getName().equals("cookie2")) {
					System.out.printf("cookie2: %s\n", str);
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return "load_cookie";
	}
	
	// SpringMVC에서 제공하는 방법 
	@GetMapping("/load_cookie2")
	public String load_cookie2(@CookieValue("cookie1") String cookie1,
								@CookieValue("cookie2") String cookie2) {	// cookie를 주입받아서 선별적으로 받을 수 있다. decoding을 포함한다. 
			System.out.printf("cookie1: %s\n", cookie1);
			System.out.printf("cookie2: %s\n", cookie2);
			
			return "load_cookie2";
	}
	
}













