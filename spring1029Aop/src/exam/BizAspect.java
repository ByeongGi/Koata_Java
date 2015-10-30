package exam;

import org.springframework.beans.factory.annotation.Autowired;

public class BizAspect 
{	
	@Autowired
	private LoginTest t1;
	
	public void beforTestVOMethod() throws Throwable
	{
		boolean res =t1.isRes();
		// res false 이면 에러를 날려라 !
		System.out.println("LOG ::: "+res);
		if(!res)
		{
			System.out.println("Good Bye");
			throw new LogIn_Exception("logIn을 실패했습니다.");
		}
	}
}
