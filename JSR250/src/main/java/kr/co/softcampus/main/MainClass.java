package kr.co.softcampus.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softcampus.Beans.TestBean01;
import kr.co.softcampus.Beans.TestBean02;
import kr.co.softcampus.Beans.TestBean03;
import kr.co.softcampus.Beans.TestBean04;
import kr.co.softcampus.Beans.TestBean05;
import kr.co.softcampus.Beans.TestBean06;
import kr.co.softcampus.config.BeanConfigClass;

public class MainClass {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctxAno = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean01 obj01 = ctxAno.getBean("obj01", TestBean01.class);
		TestBean02 obj02 = ctxAno.getBean("obj02", TestBean02.class);
		
		System.out.println("----------------------------------------------------------");
		
		TestBean03 obj03 = ctxAno.getBean("obj03", TestBean03.class);
		System.out.printf("obj3.data01: %s\n", obj03.getData01());
		System.out.printf("obj3.data02: %s\n", obj03.getData02());
		
		System.out.println("----------------------------------------------------------");
		
		TestBean04 obj04 = ctxAno.getBean("obj04", TestBean04.class);
		System.out.printf("obj4.data01: %s\n", obj03.getData01());
		System.out.printf("obj4.data02: %s\n", obj03.getData02());
		
		System.out.println("----------------------------------------------------------");
		
		TestBean05 obj05 = ctxAno.getBean("obj05", TestBean05.class);
		System.out.printf("obj5.data01: %s\n", obj05.getData01());
		System.out.printf("obj5.data02: %s\n", obj05.getData01());
		
System.out.println("----------------------------------------------------------");
		
		TestBean06 obj06 = ctxAno.getBean("obj06", TestBean06.class);
		System.out.printf("obj6.data100: %s\n", obj06.getData100());
		System.out.printf("obj6.data200: %s\n", obj06.getData200());
		
		ctxAno.close();
	}
	
}
