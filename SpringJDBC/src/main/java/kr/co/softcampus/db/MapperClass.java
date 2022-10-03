package kr.co.softcampus.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.co.softcampus.beans.JdbcBean;

@Component
public class MapperClass implements RowMapper<JdbcBean>{	// RowMapper라는 interface를 구현한다. 제너릭은 VO 클래스 타입을 사용한다.
	
	// mapRow를 오버라이드 해준다.
	public JdbcBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		// rs에서 칼럼 데이터를 가져와서 Bean에 주입하고, Bean을 반환해준다.
		
		JdbcBean bean = new JdbcBean();
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;
	}
}
