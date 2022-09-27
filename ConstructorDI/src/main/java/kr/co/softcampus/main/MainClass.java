package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.DataBean;
import kr.co.softcampus.beans.TestBean;
import kr.co.softcampus.beans.TestBeanObj;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		// java 코드로 객체 생성 
//		TestBean t01 = new TestBean();
//		t01.printData();
//		
//		System.out.println("------------------------------------");
//		
//		TestBean t02 = new TestBean(100);
//		t02.printData();
//		
//		System.out.println("------------------------------------");
//		
//		TestBean t03 = new TestBean(11.1);
//		t03.printData();
//		
//		System.out.println("------------------------------------");		
//		
//		TestBean t04 = new TestBean("String");
//		t04.printData();
//		
//		System.out.println("------------------------------------");	
//		
//		TestBean t05 = new TestBean(200, 22.22, "안녕하세요!");
//		t05.printData();
//		
//		System.out.println("------------------------------------");
//		
//		// java 코드의 생성자는 순서를 맞추지 않으면 오류를 발생시킨다  
////		TestBean t06 = new TestBean("반갑습니다", 200, 22.22);
////		t06.printData();
//		
//		System.out.println("------------------------------------");
//		
//		// xml을 통한 객체 생성 
//		TestBean obj01 = ctx.getBean("obj01", TestBean.class);
//		obj01.printData();
//		
//		System.out.println("------------------------------------");
//		
//		TestBean obj02 = ctx.getBean("obj02", TestBean.class);
//		obj02.printData();
//		
//		System.out.println("------------------------------------");
//		
//		TestBean obj03 = ctx.getBean("obj03", TestBean.class);
//		obj03.printData();
//		
//		System.out.println("------------------------------------");
//		
//		TestBean obj04 = ctx.getBean("obj04", TestBean.class);
//		obj04.printData();
//		
//		System.out.println("------------------------------------");
//		 
//		TestBean obj05 = ctx.getBean("obj05", TestBean.class);
//		obj05.printData();
//		
//		System.out.println("------------------------------------");
//		
//		TestBean obj06 = ctx.getBean("obj06", TestBean.class);
//		obj06.printData();
//		
//		System.out.println("------------------------------------");
//		
//		TestBean obj07 = ctx.getBean("obj07", TestBean.class);
//		obj07.printData();
//		
//		System.out.println("------------------------------------");
		
		// 객체를 생성자를 통해 주입: java 코드 
		DataBean d01 = new DataBean();
		DataBean d02 = new DataBean();
		TestBeanObj obBean01 = new TestBeanObj(d01, d02);
		obBean01.printData();
		
		System.out.println("------------------------------------");
		
		TestBeanObj obBean02 = ctx.getBean("obj08", TestBeanObj.class);
		obBean02.printData();
		
		System.out.println("------------------------------------");
		
		TestBeanObj obBean03 = ctx.getBean("obj09", TestBeanObj.class);
		obBean03.printData();
		
		ctx.close();
	}

}
