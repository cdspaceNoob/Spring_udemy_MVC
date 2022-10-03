package kr.co.softcampus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.co.softcampus.beans.JdbcBean;

public interface MapperInterface {
	/*
	 * 칼럼이름과 bean의 필드 이름이 다를 때는 아래 정보를 써준다.
	 * 만약 같다면 자동으로 매치해주므로 아래 정보를 작성할 필요가 없다.
	@Results({
		@Result(column = "int_data", property = "int_data"),	// 앞이 DB에 있는 값, property는 내가 받아오는 값 
		@Result(column = "str_data", property = "str_data")
	})
	*/
	
	@Select("select int_data, str_data from jdbc_table")
	List<JdbcBean> select_data();
	
	@Insert("insert into jdbc_table (int_data, str_data) values (#{int_data}, #{str_data})")
	void insert_data(JdbcBean bean);	// 이 객체에 있는 int_data값이 #{int_data}에 바인딩된다. str_data 마찬가지.
	
	@Update("update jdbc_table set str_data = #{str_data} where int_data = #{int_data}")
	void update_data(JdbcBean bean);
	
	@Delete("delete from jdbc_table where int_data = #{target}")	// 바인딩 변수가 하나만 존재한다면 이름 아무렇게나 넣어도 된다.
	void delete_data(int int_data);
}
