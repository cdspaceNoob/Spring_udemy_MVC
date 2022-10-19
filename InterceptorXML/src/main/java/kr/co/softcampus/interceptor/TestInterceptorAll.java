package kr.co.softcampus.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptorAll implements HandlerInterceptor{
	
	// Controller의 메서드가 호출되기 전에 먼저 실행된다. 이 메서드가 false를 반환하면 요청 처리에 대한 진행은 중단된다.(로그인 처리에 사용) 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TestInterceptorALL - preHandler 실행.");
		return true;
	}

	// Controller의 메서드가 호출되고 나서 실행된다. 
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TestInterceptorALL - postHandler 실행.");
	}

	// view 처리까지 완료되면 호출.
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TestInterceptorALL - afterCompletion 실행.");
	}	
	
}
