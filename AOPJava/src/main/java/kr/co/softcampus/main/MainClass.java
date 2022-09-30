package kr.co.softcampus.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctxXml = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean01 xml01 = ctxXml.getBean(TestBean01.class);
		
		try {
			xml01.method01();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		
		ctxXml.close();
		
		System.out.println("================================================================");
		
		AnnotationConfigApplicationContext ctxJava = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean01 java01 = ctxJava.getBean(TestBean01.class);
		try {
			java01.method01();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ctxJava.close();
	}

}
