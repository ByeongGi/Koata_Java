package action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.BoardDao;
import util.Paging;
import vo.BoardVo;
import vo.PaginVo;

public class BoardListAction2 extends ActionSupport implements SessionAware {
	private List<BoardVo> list;
	private String pagingCode;
	private int nowPage;
	private Map<String, Object> session;
	private String url;
	
	public String getUrl() {
		return url;
	}
	public BoardListAction2(){
		this.nowPage=1;
	}
	@Override
	public String execute() throws Exception {
		if (session.get("loginId") != null) {
			System.out.println("LOG 게시판 들어가짐");
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
		} else{		
			System.out.println("LOG 게시판 안가고 loginForm 감");
			this.url = "loginForm?url=boardlist2";
			return "login";
		}
		
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
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}
}
