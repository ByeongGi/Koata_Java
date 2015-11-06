package or.kosta.mvc.vo;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class LoginVo {
	
	@NotEmpty(message = "이메일을 입력하셔야 합니다")
	@Email
	private String email;
	
	@Size(min=6,max=10,message="이메일의 입력 범위는 6 자리 또는 10 입니다.^^" )
	private String pwd;

	public String getEmail() {
		return email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
