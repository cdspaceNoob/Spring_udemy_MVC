package kr.co.softcampus.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.softcampus.database.MapperInterface;

// 얘는 Spring MVC 프로젝트에 관련된 설정을 담고 있는 클래스다.
@Configuration	// Bean을 관리하는 Beans.xml과 동일한 역할을 한다. 이 어노테이션이 있는 클래스 내부에 @Bean을 설정한다.
@EnableWebMvc	
@ComponentScan("kr.co.softcampus.controller")	// 스캔할 패키지를 지정한다.(스캔하여 가져온 후 이 패키지에서 @Bean으로 관리할 것이다)
@PropertySource("/WEB-INF/properties/dbConfig.properties")	// Property 파일의 내용을 사용하기 위해 읽어들인다. 
public class ServletAppContext implements WebMvcConfigurer{
	
	@Value("${dbConfig.classname}")
	private String db_classname;
	
	@Value("${dbConfig.url}")
	private String db_url;
	
	@Value("${dbConfig.username}")
	private String db_username;
	
	@Value("${dbConfig.password}")
	private String db_password;
	
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
	
	// DB 접속 정보 관리.
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName(db_classname);
		source.setUrl(db_url);
		source.setUsername(db_username);
		source.setPassword(db_password);

		return source;
	}
	
	// 쿼리 및 접속을 관리.
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(source);
		SqlSessionFactory factory = factoryBean.getObject();
		
		return factory;
	}
	
	// 쿼리 실행을 위한 객체.
	@Bean
	public MapperFactoryBean<MapperInterface> mapper(SqlSessionFactory factory) throws Exception {
		MapperFactoryBean<MapperInterface> factoryBean = new MapperFactoryBean<MapperInterface>(MapperInterface.class);
		factoryBean.setSqlSessionFactory(factory);
		
		return factoryBean;
	}
	
	
	
}
