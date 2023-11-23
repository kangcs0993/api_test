package vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserVO {
	private int uid;
	private String username, password, email;
}
