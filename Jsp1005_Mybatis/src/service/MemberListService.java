package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemDao;
import model.ActionFoword;
import vo.MemberVo;

public class MemberListService implements Service {

	@Override
	public ActionFoword execute(HttpServletRequest request, 
			HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		List<MemberVo> list = MemDao.getDao().getList();
		request.setAttribute("list", list);
		return new ActionFoword("memberList.jsp", false);
	}

}
