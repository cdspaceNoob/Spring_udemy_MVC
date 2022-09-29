package kr.co.softcampus.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.beans.TestBean02;
import kr.co.softcampus.config.BeanConfigClass;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctxXml = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean01 xml01 = ctxXml.getBean("xml01", TestBean01.class);
		System.out.printf("xml01.data01: %d\n", xml01.getData01());
		System.out.printf("xml01.data02: %s\n", xml01.getData02());
		System.out.printf("xml01.data03: %s\n", xml01.getData03());
		System.out.printf("xml01.data04: %s\n", xml01.getData04());
		System.out.printf("xml01.data05: %s\n", xml01.getData05());
		System.out.printf("xml01.data06: %s\n", xml01.getData06());
		
		TestBean02 xml02 = ctxXml.getBean("xml02", TestBean02.class);
		System.out.printf("xml02.data01: %d\n", xml02.getData01());
		System.out.printf("xml02.data02: %s\n", xml02.getData02());
		System.out.printf("xml02.data03: %s\n", xml02.getData03());
		System.out.printf("xml02.data04: %s\n", xml02.getData04());
		
		ctxXml.close();
		
		System.out.println("------------------------------------------------------------");
		
		AnnotationConfigApplicationContext ctxAno = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean01 java01 = ctxAno.getBean("java01", TestBean01.class);
		System.out.printf("java01.data01: %d\n", java01.getData01());
		System.out.printf("java01.data02: %s\n", java01.getData02());
		System.out.printf("java01.data03: %s\n", java01.getData03());
		System.out.printf("java01.data04: %s\n", java01.getData04());
		System.out.printf("java01.data05: %s\n", java01.getData05());
		System.out.printf("java01.data06: %s\n", java01.getData06());
		
		TestBean02 java02 = ctxAno.getBean("java02", TestBean02.class);
		// 이 부분은 후에 component를 배우면서 다시 본다.
		System.out.printf("java02.data01: %d\n", java02.getData01());
		System.out.printf("java02.data02: %s\n", java02.getData02());
		System.out.printf("java02.data03: %s\n", java02.getData03());
		System.out.printf("java02.data04: %s\n", java02.getData04());
		
		ctxAno.close();
	}
}
