package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.BoardDao2;
import vo.Board2Vo;

public class Board2InsertAction implements Action,Preparable,ModelDriven<Board2Vo>,ServletRequestAware{
	private Board2Vo vo;
	private HttpServletRequest req;
	@Override
	public String execute() throws Exception {

		System.out.println("LOG Sql- BOARD2 VO INSERT START");
	
		vo.setReip(req.getRemoteAddr()); // 접속자의 IP 반환 
		BoardDao2.getDao().insertDB(vo);
		System.out.println("LOG Sql- BOARD2 VO INSERT END");
		return SUCCESS;
	}

	@Override
	public Board2Vo getModel() {
		return vo;
	}

	@Override
	public void prepare() throws Exception {
		vo = new Board2Vo();
	}

	@Override
	public void setServletRequest(HttpServletRequest req) {
		this.req=req;
		
	}
	
}
