package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.BoardDao;
import oracle.net.aso.p;
import util.Paging;
import vo.BoardVo;
import vo.PaginVo;

public class BoardListAction2 extends ActionSupport {
	private List<BoardVo> list;
	private String pagingCode;
	private int nowPage;
	public BoardListAction2(){
		this.nowPage=1;
	}
	@Override
	public String execute() throws Exception {
		int numPerPage =5;
		int numPerBlock =5;
		int total = BoardDao.getDao().getTotalCount();
		System.out.println("tatal");
		String url = "boardlist2";
		Paging page = new Paging(total, nowPage, numPerPage, numPerBlock, url);
		pagingCode=page.getPagingCode();
		int start = (nowPage - 1 ) * numPerBlock + 1;
		int end = start + numPerPage + 1 ;
		System.out.println("start" + start);
		System.out.println("end" + end);
		list = BoardDao.getDao().getList(new PaginVo(start,end));
		return SUCCESS;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public List<BoardVo> getList() {
		return list;
	}
	public String getPagingCode() {
		return pagingCode;
	}
}
