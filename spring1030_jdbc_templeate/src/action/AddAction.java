package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import dao.PlayMeDao;
import vo.PlayMeVo;

public class AddAction implements Action{
	private String url;
	private boolean method;
	// Spring  컨테이너로부터 Dao 를 자동으로 주입받는다.
	@Autowired
	private PlayMeDao jdbcDao;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		PlayMeVo vo = new PlayMeVo();
		vo.setPname(request.getParameter("pname"));
		vo.setPrice(Integer.parseInt(request.getParameter("price")));
		vo.setUsers(request.getParameter("users"));
		System.out.println("Pname "+vo.getPname());
		System.out.println("Price "+vo.getPrice());
		System.out.println("USERS "+vo.getUsers());
		System.out.println("LOG 확인 "+jdbcDao.getClass().getName());
		jdbcDao.add(vo);
		return new ActionForward(url, method);
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setMethod(boolean method) {
		this.method = method;
	}

	
	
}
