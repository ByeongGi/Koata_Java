package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemDao;
import model.ActionFoword;

public class MemberDelete implements Service{

	@Override
	public ActionFoword execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		int num =Integer.parseInt(request.getParameter("num"));
		// System.out.println("LOG 4  삭제할 번호 확인: " + num);
		int res=MemDao.getDao().delete(num);
		// System.out.println("LOG 4  삭제 확인: " + res);
		// redirect 방식으로 이동 -> 주소를 바꿈 
		return new ActionFoword("command?cmd=memlist", true);
	}

}
