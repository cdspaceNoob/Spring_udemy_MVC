package kr.co.softcampus.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.beans.TestBean02;
import kr.co.softcampus.beans02.TestBean03;
import kr.co.softcampus.beans02.TestBean04;
import kr.co.softcampus.beans03.TestBean05;
import kr.co.softcampus.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctxXml = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean01 xml01 = ctxXml.getBean(TestBean01.class);
		System.out.printf("xml01: %s\n", xml01);
		
		System.out.println("-------------------------------------------------------------------------");
		
		TestBean02 xml02 = ctxXml.getBean("xml02", TestBean02.class);
		System.out.printf("xml02: %s\n", xml02);
		
		TestBean02 xml03 = ctxXml.getBean("xml03", TestBean02.class);
		System.out.printf("xml03: %s\n", xml03);
		
		System.out.println("-------------------------------------------------------------------------");
		
		TestBean03 xml04 = ctxXml.getBean(TestBean03.class);
		System.out.printf("xml04: %s\n", xml04);
		
		System.out.println("-------------------------------------------------------------------------");
		
		TestBean04 xml05 = ctxXml.getBean("bean04", TestBean04.class);
		System.out.printf("xml05: %s\n", xml05);
		
		System.out.println("-------------------------------------------------------------------------");
		
		TestBean04 xml100 = ctxXml.getBean("xml100", TestBean04.class);
		System.out.printf("xml100: %s\n", xml100);
		
		TestBean04 xml200 = ctxXml.getBean("xml200", TestBean04.class);
		System.out.printf("xml200: %s\n", xml200);
		
		System.out.println("-------------------------------------------------------------------------");
		
		TestBean05 xml500 = ctxXml.getBean(TestBean05.class);
		System.out.printf("xml500: %s\n", xml500);
		
		ctxXml.close();
		
		System.out.println("=============================================================================================");
		
		AnnotationConfigApplicationContext ctxAno = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean01 java01 = ctxAno.getBean(TestBean01.class);
		System.out.printf("java01: %s\n", java01);
		
		System.out.println("-------------------------------------------------------------------------");
		
		TestBean02 java02 = ctxAno.getBean("java02", TestBean02.class);
		System.out.printf("java02: %s\n", java02);
		
		TestBean02 java03 = ctxAno.getBean("java03", TestBean02.class);
		System.out.printf("java03: %s\n", java03);
		
		System.out.println("-------------------------------------------------------------------------");
		
		TestBean03 java04 = ctxAno.getBean(TestBean03.class);
		System.out.printf("java04: %s\n", java04);
		
		System.out.println("-------------------------------------------------------------------------");
		
		TestBean04 java05 = ctxAno.getBean("bean04", TestBean04.class);
		System.out.printf("java05: %s\n", java05);
		
		System.out.println("-------------------------------------------------------------------------");
		
		TestBean04 java100 = ctxAno.getBean("java100", TestBean04.class);
		System.out.printf("java100: %s\n", java100);
		
		TestBean04 java200 = ctxAno.getBean("java200", TestBean04.class);
		System.out.printf("java100: %s\n", java200);
		
		System.out.println("-------------------------------------------------------------------------");
		
		TestBean05 java500 = ctxAno.getBean(TestBean05.class);
		System.out.printf("java500: %s\n", java500);
		
		ctxAno.close();
		
	}
	
}
