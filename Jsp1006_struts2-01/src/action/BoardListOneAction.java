package action;

import com.opensymphony.xwork2.Action;

import dao.BoardDao;
import vo.BoardVo;
import vo.MiniBoardVo;

public class BoardListOneAction implements Action{
	private BoardVo vo; // vo 는 보내주고 
	private int no;
	
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("LOG no " + no);
		this.vo = BoardDao.getDao().getlistOne(no);
		BoardDao.getDao().setHit(no);
		vo.setHit(vo.getHit()+1);
		System.out.println("---------");
		return SUCCESS;
	}
	public BoardVo getVo() {
		return vo;
	}
	
	

}
