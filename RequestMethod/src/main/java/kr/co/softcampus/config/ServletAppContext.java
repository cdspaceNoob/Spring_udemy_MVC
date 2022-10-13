package kr.co.softcampus.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 통상적으로 ServletAppContext는 Spring MVC 프로젝트에 관련된 방대한 설정을 담고 있다.
@Configuration	// @Configuration 어노테이션을 선언하면 XML 세팅에서의 Beans.xml(Bean을 관리)과 동일한 역할을 한다. 이 어노테이션이 있는 클래스 내부에 @Bean을 설정한다.
@EnableWebMvc	
@ComponentScan("kr.co.softcampus.controller")	// 스캔할 패키지를 지정한다.(이 패키지에 Bean을 선언할 수도 있는 상태지만(by @Configuration), 이 어노테이션으로 흩어져 있는 다른 경로의 Bean까지 스캔하여 가져온 후 Bean으로 관리할 것이다.)
public class ServletAppContext implements WebMvcConfigurer{
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");	// 불러올 jsp 파일의 이름만 남도록 설정. 
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");	// 위와 같이 정적 파일 경로 설정.
	}
}
