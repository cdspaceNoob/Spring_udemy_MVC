package kr.co.softcampus.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.beans.TestBean02;
import kr.co.softcampus.beans.TestBean03;
import kr.co.softcampus.beans.TestBean04;
import kr.co.softcampus.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		// XML을 사용하여 bean 객체 생성
		ClassPathXmlApplicationContext ctxXml = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean01 xml01 = ctxXml.getBean("xml01", TestBean01.class);
		System.out.printf("xml01: %s\n", xml01);
		
		// id가 같은 bean을 가져오면 동일한 주소의 객체가 반환된다(lazy 설정 안했으므로) 
		TestBean01 xml11 = ctxXml.getBean("xml01", TestBean01.class);
		System.out.printf("xml01: %s\n", xml11);
		
		System.out.println("----------------------------------------------------------");
		
		TestBean02 xml02 = ctxXml.getBean("xml02", TestBean02.class);
		System.out.printf("xml02: %s\n", xml02);
		
		TestBean02 xml22 = ctxXml.getBean("xml02", TestBean02.class);
		System.out.printf("xml22: %s\n", xml22);
		
		System.out.println("----------------------------------------------------------");
		
		TestBean03 xml03 = ctxXml.getBean("xml03", TestBean03.class);
		System.out.printf("xml03: %s\n", xml03);
		
		System.out.println("----------------------------------------------------------");
		
		TestBean03 xml33 = ctxXml.getBean("xml03", TestBean03.class);
		System.out.printf("xml03: %s\n", xml33);
		
		System.out.println("----------------------------------------------------------");
		
		TestBean04 xml04 = ctxXml.getBean(TestBean04.class);
		System.out.printf("xml04: %s\n", xml04);
		
		ctxXml.close();
		
		System.out.println("----------------------------------------------------------");
		
		// Java 파일을 사용하여 bean 객체 생성
		AnnotationConfigApplicationContext ctxAno = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean01 java01 = ctxAno.getBean("java01", TestBean01.class);
		System.out.printf("java01: %s\n", java01);
		
		// 마찬가지로 동일한 이름의 객체를 가져오면 동일한 주소만 반환된다(lazy 설정 안했으므로)
		TestBean01 java11 = ctxAno.getBean("java01", TestBean01.class);
		System.out.printf("java11: %s\n", java11);
		
		TestBean01 java500 = ctxAno.getBean("java600", TestBean01.class);
		System.out.printf("java500: %s\n", java500);
		
		System.out.println("----------------------------------------------------------");
		
		TestBean02 java02 = ctxAno.getBean("java02", TestBean02.class);
		System.out.printf("java02: %s\n", java02);
		
		TestBean02 java22 = ctxAno.getBean("java02", TestBean02.class);
		System.out.printf("java22: %s\n", java22);
		
		System.out.println("----------------------------------------------------------");
		
		TestBean03 java03 = ctxAno.getBean("java03", TestBean03.class);
		System.out.printf("java03: %s\n", java03);
		
		TestBean03 java33 = ctxAno.getBean("java03", TestBean03.class);
		System.out.printf("java33: %s\n", java33);
		
		TestBean04 java04 = ctxAno.getBean(TestBean04.class);
		System.out.printf("java04: %s\n", java04);
		
		ctxAno.close();
	}
}
