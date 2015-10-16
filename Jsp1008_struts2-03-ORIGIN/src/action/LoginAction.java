package action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.MemDao;
import vo.MemberVo;
// SesstionAware 를 구현하면 스트럿츠에 의해서 주입받을수 있다.
public class LoginAction implements Action,Preparable,ModelDriven<MemberVo>,SessionAware{
	private MemberVo vo;
	private Map<String,Object> session;
	private String url;
	private int no;
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	@Override
	public String execute() throws Exception {
		// 가상의 아이디와 비번을 테스트 하겠다 
		
		Map<String, String> map = new HashMap<>();
		map.put("id", vo.getId());
		map.put("pwd", vo.getPwd());
		int res=MemDao.getDao().login(map);
		if (res>0) {
			System.out.println("로그인 성공");
			session.put("loginId", vo.getId());	
			if (vo.getId().equals("wwww3426")) session.put("role", "admin");
			goUrl();
			return SUCCESS;
		} else{
			System.out.println("로그인 실패 ");
			return "INPUT";
		}
		
		
	}
	// logout시 실행되는 메소드
	public String logout() throws Exception{
		// 세션을 로그아웃시 삭제한다.
		session.remove("loginId");
		session.remove("role");
		return SUCCESS;
	}
	
	
	public void goUrl(){
		if (url != null && no != 0 ) {
			this.url=url+"?no="+no;
			System.out.println("로그인 후 화면 분기 :" +url);
		} else{
			this.url=url;
			System.out.println("로그인 후 화면 분기 " + url );
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void setSession(Map<String, Object> sesssion) {
		this.session = sesssion;
	}
	
	// VO 를 만들고 
	@Override
	public void prepare() throws Exception {
		this.vo = new MemberVo();
	}
	@Override
	public MemberVo getModel() {
		return vo;
	}


}
