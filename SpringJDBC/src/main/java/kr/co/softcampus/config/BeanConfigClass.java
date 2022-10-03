package kr.co.softcampus.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = {"kr.co.softcampus.beans", "kr.co.softcampus.db"})
public class BeanConfigClass {

	// DataSource
	@Bean
	public BasicDataSource source() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/gntp");
		source.setUsername("root");
		source.setPassword("12341234");
		
		return source;
	}
	
	// 이 Bean이 생성될 때 위의 BasicDataSrouce 클래스 타입이 자동으로 주입 된다
	// 데이터베이스에 접속하여 쿼리를 전달하는 bean 설정
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
		// 데이터소스(접속 정보를 가지고 있는 객체: DBCP)
		JdbcTemplate db = new JdbcTemplate(source);
		return db;
	}
}
