package kr.co.softcampus.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor{
	
	// init-method 호출 전에 호출되는 함수 
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("before init-method");
		
		switch(beanName) {
		case "t01" :
			System.out.println("id가 t01인 bean 객체 생성");
			break;
		case "t02" :
			System.out.println("id가 t02인 bean 객체 생성");
		}
		
		//id가 String beanName인 bean객체의 주소가 반환된다
		return bean;
	}
	
	//init-method 호출 후에 실행되는 함수 
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub

		//id가 String beanName인 bean객체의 주소가 반환된다
		System.out.println("after init-method");
		return bean;
	}
}
