package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemDao;
import model.ActionFoword;
import vo.MemberVo;

public class MemAddService implements Service{

	@Override
	public ActionFoword execute(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		request.setCharacterEncoding("UTF-8");
		// 파라미터로 넘어온 값을 VO 나 MAP 으로 저장한후 
		// Dao 로 넘겨야함 
		
		MemberVo vo = new MemberVo();
		vo.setId(request.getParameter("id"));
		vo.setName(request.getParameter("name"));
		vo.setPwd(request.getParameter("pwd"));
		vo.setPost(request.getParameter("post"));
		vo.setRoadAddress(request.getParameter("roadAddress"));
		vo.setJibunaddress(request.getParameter("jibunAddress"));
	
		
		int res = MemDao.getDao().addMem(vo);
		if (res>0) {
			request.setAttribute("msg", "회원가입 성공");
		}
		return new ActionFoword("success.jsp", false);
	}
	
}
