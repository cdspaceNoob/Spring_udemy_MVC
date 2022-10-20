package kr.co.softcampus.database;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import kr.co.softcampus.beans.DataBean;

public interface MapperInterface {

	@Insert("insert into spring_mvc_table(data1, data2, data3) values(#{data1}, #{data2}, #{data3})")
	void insert_data(DataBean dataBean);	// dataBean을 받아서 필드값에 대응하는 값을 위의 쿼리에 넣어준다. 
	
	@Select("select data1, data2, data3 from spring_mvc_table")
	List<DataBean> select_data();	// 쿼리를 실행해서 가져오는 데이터의 row는 하나의 dataBean이므로 List로 반환한다. 
}
