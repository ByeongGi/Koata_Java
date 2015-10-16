package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

import dao.BoardDao;
import vo.BoardVo;
// list 에서 제목을 클릭했을때 no 값을 파라미터로 받아 오면서 실행되는 Detail 객체
public class BoardListOneAction implements Action , SessionAware{
	private BoardVo vo; // vo 는 보내주고 
	private int no;
	private Map<String, Object> session;
	private String url;
	
	public String getUrl() {
		return url;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String execute() throws Exception {
		// System.out.println("LOG no " + no);
		if (session.get("loginId") != null){
			
			this.vo = BoardDao.getDao().getlistOne(no);
			BoardDao.getDao().setHit(no);
			vo.setHit(vo.getHit()+1);
			
			return SUCCESS;
		} else{
			
			this.url = "loginForm?url=boardDetail&no="+no;
			return "login"; 
		}
		
		// System.out.println("---------");
	}
	public BoardVo getVo() {
		return vo;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	
	

}
