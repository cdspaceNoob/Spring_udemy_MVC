package kr.co.softcampus.advisor;

import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

public class AdvisorClass {
	
	public void beforeMethod() {
		System.out.println("before Method 호출");
	}
	
	public void afterMethod() {
		System.out.println("after Method 호출");
	}
	
	public Object aroundMethod(MethodInvocationProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod 호출01");
		
		Object obj = pjp.proceed();
	
		System.out.println("aroundMethod 호출02");
		
		return obj;
	}
	
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 호출");
	}
	
	public void afterThrowingMethod(Throwable e1) {
		//e1은 자동 주입된다!(Beans.xml에 명시)
		System.out.println("afterThrowingMethod 호출");
		System.out.println(e1);
	}
}
