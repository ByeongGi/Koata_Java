package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.BoardDao2;
import vo.Bbs_CommmVo;

public class CommInAction implements Action , Preparable, ModelDriven<Bbs_CommmVo>,ServletRequestAware{
	private Bbs_CommmVo vo; // set
	private int no; // set, get
	private String url;
	private HttpServletRequest req;
	public String getUrl() {
		return url;
	}



	@Override
	public String execute() throws Exception {
		// 입력을 하고 다시 해당 View 로 이동 
		//System.out.println("LOG COMMIN INSERT VO START");
		//System.out.println("LOG no  :::: ->  "+no);
		vo.setReip(req.getRemoteAddr());
		vo.setTcode(no); // Reference fk key 로 넣어줌 
		BoardDao2.getDao().commin(vo);
		//System.out.println("LOG COMMIN INSERT VO END");
		//this.url= "view?no="+no;
		return SUCCESS;
	}

	

	public int getNo() {
		return no;
	}



	public void setVo(Bbs_CommmVo vo) {
		this.vo = vo;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public Bbs_CommmVo getModel() {
		return vo;
	}

	@Override
	public void prepare() throws Exception {
		vo = new Bbs_CommmVo();
	}



	@Override
	public void setServletRequest(HttpServletRequest req) {
		this.req=req;
		
	}


}
