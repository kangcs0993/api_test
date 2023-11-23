package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.UserVO;

public class UserDAO {
	SqlSession sqls;
	
	public UserDAO(SqlSession sqls) {
		this.sqls = sqls;
	}
	
	public List<UserVO> selectAll(){
		return sqls.selectList("u.user_list");
	}
}
