package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import dao.PlayMeDao;
import vo.PlayMeVo;

public class ListAciton implements Action{
	private String url;
	private boolean method;
	// Spring  컨테이너로부터 Dao 를 자동으로 주입받는다.
	@Autowired
	private PlayMeDao jdbcDao;
	
	public void setUrl(String url) 
	{
		this.url = url;
	}
	public void setMethod(boolean method) 
	{
		this.method = method;
	}
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) 
			throws IOException 
	{
		System.out.println("LOG 확인 "+jdbcDao.getClass().getName());
		List<PlayMeVo> list = jdbcDao.getList();
		// RequestScope에 저장
		request.setAttribute("list", list);
		return new ActionForward(url, method);
	}
	
	
}
