package action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import dao.BoardDao2;
import vo.Bbs_CommmVo;
import vo.Board2Vo;

public class Board2View implements Action{
	private int no;
	private Board2Vo vo;
	private List<Bbs_CommmVo> list;
	@Override
	public String execute() throws Exception {
		System.out.println("LOG Sql- BOARD2 VIEW START");
		System.out.println("LOG Param no : "+no); // BOARD VIEW
		vo=BoardDao2.getDao().getDao().view(no);
		System.out.println("LOG Sql- BOARD2 VIEW START");
		list= BoardDao2.getDao().bbs_view(no); // BBS VIEW
		return SUCCESS;
	}
	public List<Bbs_CommmVo> getList() {
		return list;
	}
	public Board2Vo getVo() {
		return vo;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
}
