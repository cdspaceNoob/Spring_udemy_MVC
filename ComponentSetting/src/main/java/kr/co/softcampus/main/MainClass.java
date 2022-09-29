package kr.co.softcampus.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softcampus.beans.TestBean01;
import kr.co.softcampus.beans.TestBean02;
import kr.co.softcampus.beans.TestBean03;
import kr.co.softcampus.beans.TestBean04;
import kr.co.softcampus.beans.TestBean05;
import kr.co.softcampus.config.BeanConfigClass;

public class MainClass {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctxAno = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean01 t01 = ctxAno.getBean(TestBean01.class);
		System.out.printf("t01: %s\n", t01);
		
		TestBean01 t02 = ctxAno.getBean(TestBean01.class);
		System.out.printf("t02: %s\n", t02);
		
		TestBean02 t03 = ctxAno.getBean("t03", TestBean02.class);
		System.out.printf("t03: %s\n", t03);
		
		TestBean02 t04 = ctxAno.getBean("t03", TestBean02.class);
		System.out.printf("t04: %s\n", t04);
		
		TestBean02 t05 = ctxAno.getBean("t05", TestBean02.class);
		System.out.printf("t05: %s\n", t05);
		
		TestBean02 t06 = ctxAno.getBean("t06", TestBean02.class);
		System.out.printf("t06: %s\n", t06);

		TestBean03 t07 = ctxAno.getBean(TestBean03.class);
		System.out.printf("t07: %s\n", t07);
		
		TestBean03 t08 = ctxAno.getBean(TestBean03.class);
		System.out.printf("t08: %s\n", t08);
		
		TestBean04 t09 = ctxAno.getBean(TestBean04.class);
		System.out.printf("t09: %s\n", t09);
		
		TestBean04 t10 = ctxAno.getBean(TestBean04.class);
		System.out.printf("t10: %s\n", t10);
		
		TestBean05 t11 = ctxAno.getBean(TestBean05.class);
		System.out.printf("t11: %s\n", t11);
		
		TestBean05 t12 = ctxAno.getBean(TestBean05.class);
		System.out.printf("t11: %s\n", t11);
		
		ctxAno.close();
	}
	
}
