package action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import dao.MiniBoardDao;
import vo.MiniBoardVo;

public class ListAction implements Action{
	private List<MiniBoardVo> list;
	@Override
	public String execute() throws Exception {
		System.out.println("List 동작!");
		this.list=MiniBoardDao.getDao().list();
		return SUCCESS;
	}
	public List<MiniBoardVo> getList() {
		return list;
	}
}
