package kr.co.softcampus.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.co.softcampus.beans.JdbcBean;

@Component
public class JdbcDAO {
	// 여기에 데이터베이스 처리와 관련된 코드를 작성한다.
	// 데이터베이스와 관련된 작업을 수행해주는 객체가 필요한데, 걔가 JdbcTemplate이다.
	// 따라서 JdbcTemplate를 이 여기에 주입해준다.(매번 JdbcTemplate 객체를 생성하는 번거로움을 해결)
	
	// JDBC 관리 객체 주입.(연결을 위해 매번 가져오는 클래스)
	@Autowired
	private JdbcTemplate db;
	
	// Mapper를 주입.(ResultSet을 받기 위해 매번 가져오는 클래스)
	@Autowired
	private MapperClass mapper;
	
	// insert
	public void insert_date(JdbcBean bean) {	// 여기서 JdbcBean은 VO와 같다. 아까 생성했던 클래스다.
		String sql = "insert into jdbc_table(int_data, str_data) value (?, ?)";
		// insert, update, delete는 .update 메서드를 사용한다. 다시 말해, insert / update / delete의 형식은 동일하고 쿼리만 다르다.
		// 첫 번째 파라미터는 sql, 이후는 바인딩 value를 넣어준다. 이 메서드의 파라미터에 미리 생성해둔 bean이 들어오게 된다.(service클래스 또는 controller클래스에서 생성 및 설정할 것임)
		db.update(sql, bean.getInt_data(), bean.getStr_data());
	}
	
	// select
	public List<JdbcBean> select_data(){
		String sql = "select int_data, str_data from jdbc_table";
		// 첫 번째 파라미터는 sqwl, 두 번째 파라미터에는 mapper를 넣어준다. mapper는 ResultSet을 받아준다.
		List<JdbcBean> list = db.query(sql, mapper);
		return list;
	}
	
	// update
	public void update_data(JdbcBean bean) {
		String sql = "update jdbc_table set str_data = ? where int_data =?";
		db.update(sql, bean.getStr_data(), bean.getInt_data());
	}
	
	// delete
	public void delete_data(int int_data) {
		String sql = "delete from jdbc_table where int_data = ?";
		db.update(sql, int_data);
		
	}
}
