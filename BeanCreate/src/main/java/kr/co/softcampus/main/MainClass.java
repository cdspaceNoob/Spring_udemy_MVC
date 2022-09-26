package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// beans.xml 불러오기: ApplicationContext 사용 - 패키지 내부일 때: ClassPathXmlApplicationContext 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		// id가 test1인 bean 객체의 주소값 받아오기 
		TestBean t1 = ctx.getBean("test1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		// 생성된 객체는 더 이상 생성되지 않는다(싱글톤): 동일한 객체를 또 다시 받아와도 이미 객체가 생성되어 있으므로 그대로 가져다 쓴다
		TestBean t2 = ctx.getBean("test1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
		// id가 test2인 bean 객체의 주소값 받아오기 
		TestBean t3 = ctx.getBean("test2", TestBean.class);
		System.out.printf("t3 : %s\n", t3);
		
		TestBean t4 = ctx.getBean("test2", TestBean.class);
		System.out.printf("t4 : %s\n", t4);
		
		TestBean t5 = ctx.getBean("test3", TestBean.class);
		System.out.printf("t5 : %s\n", t5);
		
		TestBean t6 = ctx.getBean("test3", TestBean.class);
		System.out.printf("t6 : %s\n", t6);
		ctx.close();
	}

}
