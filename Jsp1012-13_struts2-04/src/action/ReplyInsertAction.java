package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.BoardDao2;
import vo.Board2Vo;

// 답변글 작성후  폼에서 넘어온 값을 DAO 로 전달하기 위한 액션 
public class ReplyInsertAction implements Action, Preparable, ModelDriven<Board2Vo>, ServletRequestAware {
	private Board2Vo vo;
	private HttpServletRequest req;

	
	public String execute() throws Exception {
		System.out.println("LOG REPLY INSERT");
		System.out.println(vo.getLvl());
		System.out.println(vo.getRef());
		System.out.println(vo.getSeq());
		vo.setReip(req.getRemoteAddr());
		BoardDao2.getDao().replayInsert(vo);
		System.out.println("LOG REPLY INSERT END");
		return SUCCESS;
	}

	@Override
	public void setServletRequest(HttpServletRequest req) {
		this.req = req;

	}

	@Override
	public Board2Vo getModel() {
		return vo;
	}

	@Override
	public void prepare() throws Exception {
		vo = new Board2Vo();

	}
}
