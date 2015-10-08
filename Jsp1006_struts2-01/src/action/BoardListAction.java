package action;


import java.util.List;

import com.opensymphony.xwork2.Action;

import dao.BoardDao;
import vo.BoardVo;

public class BoardListAction implements Action{
	private List<BoardVo> list;
	@Override
	public String execute() throws Exception {
		System.out.println("List 동작!");
		this.list=BoardDao.getDao().list();
		return SUCCESS;
	}
	public List<BoardVo> getList() {
		return list;
	}
}
