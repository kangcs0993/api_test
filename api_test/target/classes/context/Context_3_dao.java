package context;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.UserDAO;

@Configuration
public class Context_3_dao {
	@Bean
	public UserDAO udao(SqlSession sqls) {
		return new UserDAO(sqls);
	}
}