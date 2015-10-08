package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemDao;
import model.ActionFoword;
import vo.MemberVo;

public class MemberUpdate implements Service {

	@Override
	public ActionFoword execute(HttpServletRequest request, 
			HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		// 파라미터로 넘어온 값을 VO 나 MAP 으로 저장한후 
		// Dao 로 넘겨야함 
		ActionFoword af = null;
		String handler = request.getParameter("handler");
		if ("form".equals(handler) ) {
			
			// System.out.println("Log 7 서비스 update" + handler);
			int num =  Integer.parseInt(request.getParameter("num"));
			MemberVo vo =MemDao.getDao().getSelectOne(num);
			request.setAttribute("vo", vo);
			af = new ActionFoword("memberUpdate.jsp", false);
			
		} else if ("update".equals(handler) ){
			// System.out.println("Log 7 서비스 update" + handler);
			MemberVo vo = new MemberVo();
			vo.setId(request.getParameter("id"));
			vo.setName(request.getParameter("name"));
			vo.setPwd(request.getParameter("pwd"));
			vo.setPost(request.getParameter("post"));
			vo.setRoadAddress(request.getParameter("roadAddress"));
			vo.setJibunaddress(request.getParameter("jibunAddress"));
			int num=Integer.parseInt(request.getParameter("num"));
			vo.setNum(num);
			
			int res =MemDao.getDao().update(vo);
			// System.out.println("LOG 8 UPDATE  확인"+ res);
			af = new ActionFoword("command?cmd=memlist", true);
		}
		
		
		return af;
	}

}
