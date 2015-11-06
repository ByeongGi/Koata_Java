package ex1;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
@Aspect
public class today_Obj {
	@Autowired
	private SimpleDateFormat f;
	@Autowired
	private Date d;
	
	@AfterReturning(pointcut="execution(* todate*(..))",returning="ret")
	public ModelAndView today(JoinPoint pjb,Object ret) throws Throwable{
		
		System.out.println("LOG AOP 실행");
		String res=f.format(d);
		System.out.println("LOG"+res);
		ModelAndView mv=(ModelAndView)ret;
		mv.addObject("today",res);

		return mv;
	}
}
