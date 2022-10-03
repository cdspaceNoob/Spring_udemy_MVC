package kr.co.softcampus.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softcampus.beans.JdbcBean;
import kr.co.softcampus.config.BeanConfigClass;
import kr.co.softcampus.mapper.MapperInterface;

public class MainClass {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		// 이름으로(메서드 이름) Mapper 가져오기.
		MapperInterface mapper = ctx.getBean("test_mapper", MapperInterface.class);
		
		// insert: mapper의 insert 메서드 사용한다.
//		JdbcBean beanInsert01 = new JdbcBean();
//		beanInsert01.setInt_data(100);
//		beanInsert01.setStr_data("문자열01");
//		mapper.insert_data(beanInsert01);
//		
//		JdbcBean beanInsert02 = new JdbcBean();
//		beanInsert02.setInt_data(200);
//		beanInsert02.setStr_data("문자열02");
//		mapper.insert_data(beanInsert02);

		// update
		JdbcBean beanUpdate01 = new JdbcBean();
		beanUpdate01.setInt_data(2);
		beanUpdate01.setStr_data("변경된 문자열");
		mapper.update_data(beanUpdate01);
		
		mapper.delete_data(200);
		
		// select
		List<JdbcBean> list01 = mapper.select_data();
		for(JdbcBean bean : list01) {
			System.out.printf("int_data: %d\n", bean.getInt_data());
			System.out.printf("str_data: %s\n", bean.getStr_data());
			System.out.println("---------------------------------");
		}
		
		ctx.close();
	}
	
}
