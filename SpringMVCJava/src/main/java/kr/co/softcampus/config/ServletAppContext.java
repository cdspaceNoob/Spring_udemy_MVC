package kr.co.softcampus.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Spring MVC 프로젝트에 관련된 설정을 담고 있는 클래스다.
@Configuration	// Bean을 관리하는 Beans.xml과 동일한 역할을 한다. 이 어노테이션이 있는 클래스 내부에 @Bean을 설정한다.
@EnableWebMvc	
@ComponentScan("kr.co.softcampus.controller")	// 스캔할 패키지 지정한다.(이 패키지에서 @Bean으로 관리할 것이다)
public class ServletAppContext implements WebMvcConfigurer{
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");	// jsp 파일 설정 
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");	// 정적 파일 경로 설정
	}
}
