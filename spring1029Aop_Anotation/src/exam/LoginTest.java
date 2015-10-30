package exam;

import java.util.Properties;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginTest 
{	
	
	private Properties prop;
	
	private boolean ispwd;
	private int loginCnt;
	
	public LoginTest(Properties prop) 
	{	this.prop = prop;
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요");		
		ex:for (int i = 0; i < 3; i++) {
			System.out.println("비밀번호:");
			String pwd =sc.nextLine();
			
			if("1234".equals(pwd))
			{
				System.out.println("LOG :::  로그인 성공");
				ispwd = true;
				break ex;
			} else{
				
				loginCnt +=1;
				 System.out.println(prop.getProperty("msg"+loginCnt));
				if(loginCnt==3) ispwd=false;
			}
		}
	} // end LoginTest()
	
	// 비밀번호 일치 여부 결과 반환
	public boolean isRes(){
		return this.ispwd;
	}
}
