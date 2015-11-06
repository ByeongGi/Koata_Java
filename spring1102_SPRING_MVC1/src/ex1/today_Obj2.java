package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class today_Obj2 {
	@Autowired
	private SimpleDateFormat f;
	@Autowired
	private Date d;
	
	@Before("execution(* todate*(..))")
	public void today() throws Throwable{
		HttpServletRequest request = ((ServletRequestAttributes)
				RequestContextHolder.currentRequestAttributes()).getRequest();
		request.setAttribute("today", f.format(d));

	}

}
