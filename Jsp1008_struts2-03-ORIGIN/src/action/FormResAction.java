package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.MiniBoardDao;
import vo.MiniBoardVo;

// Action을 구현하는 두번째 방법
// VO 를 생성하는 인터센터가 만족하는 인터페이스를 구현해야 함
// 1. Prepable이 Vo를 생성해주고 (인터셉터 스택에서)
// 2. ModelDriven 이 Vo 를 넘겨주고
// 3. params 가 setter 로 파라미터를 주입해줌 
// 인터셉터의 메서드는 인터셉터 스택에서 수행이 됨
public class FormResAction implements Action,Preparable,ModelDriven<MiniBoardVo>{
	// 파라미터 인터센터가 등록되어 있어서 
	// 외부에서 파라미터가 있을시 Params 란 인터센터가 알아서 
	// ValueStack 에 
	// property (getter , setter)를 호출하여 값을 저장해준다.
	// private String sub,writer,cont;
	// reques.getParmeter 를 받아주는 것 -> Interceptor 중 params 가 해줌 
	
	private MiniBoardVo vo;
	@Override
	public String execute() throws Exception {
		System.out.println("sub"+vo.getSub());
		System.out.println("writer"+vo.getWriter());
		System.out.println("cont"+vo.getCont());
		// MiniBoardVo vo = new MiniBoardVo();
		/*vo.setSub(sub);
		vo.setWriter(writer);
		vo.setCont(cont);*/
		vo.setReip("192.112.123.12");
		
		MiniBoardDao.getDao().insert(vo);
		return SUCCESS;
	}
	
	/*public void setSub(String sub) {
		this.sub = sub;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}*/
	
	// Preparable 가 인터셉터가 구현되었으면 instasof 메소드로 구현됬는지 검사
	@Override
	public void prepare() throws Exception {
		vo = new MiniBoardVo();
	}
	
	// ModelDriven 가 인터셉터가 구현되었으면 instasof 메소드로 구현됬는지 검사
	@Override
	public MiniBoardVo getModel() {
		
		return vo;
	}


}
