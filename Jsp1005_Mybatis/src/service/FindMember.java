package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemDao;
import model.ActionFoword;
import vo.MemberVo;

public class FindMember implements Service {

	@Override
	public ActionFoword execute(HttpServletRequest request, 
			HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		// 파라미터로 넘어온 값을 VO 나 MAP 으로 저장한후 
		// Dao 로 넘겨야함 
		ActionFoword af = null;
			
			String name = request.getParameter("name");
			// System.out.println("Log 7 서비스 update" + handler);
			
			System.out.println("name : " + name);
			List<MemberVo> list=MemDao.getDao().getMember(name);
			request.setAttribute("list",list);
			af = new ActionFoword("data2.jsp", false);
		return af;
	}

}
