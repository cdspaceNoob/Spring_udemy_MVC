package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.beans.TestBean02;

public class MainClass {
	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean01 xml01 = ctx.getBean("xml01", TestBean01.class);
		TestBean02 xml02 = ctx.getBean("xml02", TestBean02.class);
		
		// 이미 TestBean01이라는 타입이 하나 정의되어 있으므로, 다른 위치의 다른 TestBean01은 경로를 모두 작성한다.
		kr.co.softcampus.beans02.TestBean01 xml03 = ctx.getBean("xml03", kr.co.softcampus.beans02.TestBean01.class);
		
		xml01.method01();
		
		System.out.println("---------------------------------------------------");
		
//		xml01.method02();
		
		xml01.method01(100);
		
		System.out.println("---------------------------------------------------");
		
		xml01.method01("string");
		
		System.out.println("---------------------------------------------------");
		
		xml01.method01(100, 200);
		
		System.out.println("---------------------------------------------------");
		
		xml01.method01(0, "Str");
		
		System.out.println("---------------------------------------------------");
		
		xml01.method02();
		
		System.out.println("---------------------------------------------------");
		
		xml02.method01();
		
		System.out.println("---------------------------------------------------");
		
		xml03.method01();
		
		System.out.println("---------------------------------------------------");
		
		int a01 = xml01.method03();
		System.out.printf("int a01: %d\n", a01);
		
		ctx.close();
	}
	
}
