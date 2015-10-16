package action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import dao.BoardDao2;
import vo.Board2Vo;

public class Board2ListAction implements Action{
	private List<Board2Vo> list;
	@Override
	public String execute() throws Exception {
		System.out.println("LOG Sql- BOARD2 VO SELECT START");
		list=BoardDao2.getDao().getList();
		System.out.println("LOG Sql- BOARD2 VO SELECT END");
		return SUCCESS;
	}
	public List<Board2Vo> getList() {
		return list;
	}
	
	
}
