package kr.co.softcampus.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softcampus.beans.JdbcBean;
import kr.co.softcampus.config.BeanConfigClass;
import kr.co.softcampus.db.JdbcDAO;

public class MainClass {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		// DAO 가져오기.
		// bean으로 설정된 dao를 가져온다.
		JdbcDAO dao = ctx.getBean(JdbcDAO.class);
		
		// VO를 생성하여 값을 설정한다.
		// insert
//		JdbcBean bean01 = new JdbcBean();
//		bean01.setInt_data(1);
//		bean01.setStr_data("문자열01");
//		// DAO의 메서드를 사용한다.
//		dao.insert_date(bean01);
//		
//		JdbcBean bean02 = new JdbcBean();
//		bean02.setInt_data(2);
//		bean02.setStr_data("문자열02");
//		dao.insert_date(bean02);
//		
//		System.out.println("저장 완료");

		// update
//		JdbcBean update_bean = new JdbcBean();
//		update_bean.setInt_data(1);
//		update_bean.setStr_data("변경된 문자열");
//		dao.update_data(update_bean);
		
		// delete
		// int_data가 1인 row를 삭제하겠다는 뜻.
		dao.delete_data(1);
		
		//select 
		List<JdbcBean> list = dao.select_data();
		
		for(JdbcBean bean : list) {
			System.out.printf("int_data: %d\n", bean.getInt_data());
			System.out.printf("str_data: %s\n", bean.getStr_data());
			System.out.println("---------------------------------");
		}
		
		ctx.close();
	}
	
}
