package kr.co.softcampus.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctxXml = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean01 xml01 = ctxXml.getBean("xml01", TestBean01.class);
		System.out.printf("xml01.data01: %d\n", xml01.getData01());
		System.out.printf("xml01.data02: %s\n", xml01.getData02());
		System.out.printf("xml01.data03: %s\n", xml01.getData03());
		
		ctxXml.close();
		
		System.out.println("---------------------------------------------------------");
		
		AnnotationConfigApplicationContext ctxAno = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean01 java01 = ctxAno.getBean("java01", TestBean01.class);
		System.out.printf("java01.data01: %d\n", java01.getData01());
		System.out.printf("java01.data02: %s\n", java01.getData02());
		System.out.printf("java01.data03: %s\n", java01.getData03());
		
		ctxAno.close();
	}
}
