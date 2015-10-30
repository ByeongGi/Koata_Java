package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import dao.PlayMeDao;
import vo.PlayMeVo;

public class DetailAction implements Action{
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
		int num=Integer.parseInt(request.getParameter("num"));
		PlayMeVo vo=jdbcDao.getView(num);
		request.setAttribute("vo", vo);
		return new ActionForward(url, method);
	}
}
