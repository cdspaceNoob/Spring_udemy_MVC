package kr.co.softcampus.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.beans.TestBean02;
import kr.co.softcampus.beans.TestBean03;
import kr.co.softcampus.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctxXml = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean01 xml01 = ctxXml.getBean("xml01", TestBean01.class);
		System.out.printf("xml01.data01: %d\n", xml01.getData01());
		System.out.printf("xml01.data02: %s\n", xml01.getData02());
		System.out.printf("xml01.data03: %s\n", xml01.getData03());
		
		System.out.println("---------------------------------------------------------");
		
		TestBean01 xml02 = ctxXml.getBean("xml02", TestBean01.class);
		System.out.printf("xml02.data01: %d\n", xml02.getData01());
		System.out.printf("xml02.data02: %s\n", xml02.getData02());
		System.out.printf("xml02.data03: %s\n", xml02.getData03());
		
		System.out.println("---------------------------------------------------------");
		
		TestBean02 xml03 = ctxXml.getBean("xml03", TestBean02.class);
		System.out.printf("xml03.data01: %s\n", xml03.getData01());
		System.out.printf("xml03.data02: %s\n", xml03.getData02());
		
		System.out.println("---------------------------------------------------------");
		
		TestBean03 xml04 = ctxXml.getBean("xml04", TestBean03.class);
		System.out.printf("xml04.data01: %s\n", xml04.getData01());
		System.out.printf("xml04.data02: %s\n", xml04.getData02());
		
		ctxXml.close();
		
		System.out.println("---------------------------------------------------------");
		
		AnnotationConfigApplicationContext ctxAno = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean01 java01 = ctxAno.getBean("java01", TestBean01.class);
		System.out.printf("java01.data01: %d\n", java01.getData01());
		System.out.printf("java01.data02: %s\n", java01.getData02());
		System.out.printf("java01.data03: %s\n", java01.getData03());
		
		System.out.println("---------------------------------------------------------");
		
		TestBean01 java02 = ctxAno.getBean("java02", TestBean01.class);
		System.out.printf("java02.data01: %d\n", java02.getData01());
		System.out.printf("java02.data02: %s\n", java02.getData02());
		System.out.printf("java02.data03: %s\n", java02.getData03());
		
		System.out.println("---------------------------------------------------------");
		
		TestBean02 java03 = ctxAno.getBean("java03", TestBean02.class);
		System.out.printf("java03.data01: %s\n", java03.getData01());
		System.out.printf("java03.data02: %s\n", java03.getData02());
		
		System.out.println("---------------------------------------------------------");
		
		TestBean03 java04 = ctxAno.getBean("java04", TestBean03.class);
		System.out.printf("java04.data01: %s\n", java04.getData01());
		System.out.printf("java04.data02: %s\n", java04.getData02());
		
		ctxAno.close();
	}
}
