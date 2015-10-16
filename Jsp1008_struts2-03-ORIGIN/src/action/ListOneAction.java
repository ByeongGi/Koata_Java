package action;

import com.opensymphony.xwork2.Action;

import dao.MiniBoardDao;
import vo.MiniBoardVo;

public class ListOneAction implements Action{
	private MiniBoardVo vo; // vo 는 보내주고 
	private int num; // num을 받고 
	@Override
	public String execute() throws Exception {
		this.vo = MiniBoardDao.getDao().getlistOne(num);
		return SUCCESS;
	}
	public MiniBoardVo getVo() {
		return vo;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

}
