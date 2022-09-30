package kr.co.softcampus.advisor;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect	// advisor 역할로 등록하겠다.
@Component
public class AdvisorClass {
	
	@Before("execution(* method01())")
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	@After("execution(* method01())")
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	@Around("execution(* method01())")
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod 호출(1)");
		Object result = pjp.proceed();
		System.out.println("aroundMethod 호출(2)");
		return result;
	}
	
	@AfterReturning("execution(* method01())")
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod() 호출");
	}
	
	@AfterThrowing("execution(* method01())")
	public void afterThrowingMethod() {
		System.out.println("afterThrowingMethod() 호출");
	}
}
