package action;


import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.BoardDao;
import vo.BoardVo;

public class BoardListAction implements Action,Preparable,ModelDriven<BoardVo>{
	private List<BoardVo> list;
	private BoardVo vo;
	@Override
	public String execute() throws Exception {
		System.out.println("List 동작!");
		this.list=BoardDao.getDao().getList(vo);
		System.out.println(vo.getSearchType());
		System.out.println(vo.getSearchValue());
		return SUCCESS;
	}
	public List<BoardVo> getList() {
		return list;
	}
	@Override
	public BoardVo getModel() {
		return vo;
	}
	@Override
	public void prepare() throws Exception {
		vo = new BoardVo();
	}
}
