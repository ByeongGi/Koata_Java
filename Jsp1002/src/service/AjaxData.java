package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ActionFoword;

public class AjaxData implements Service{

	@Override
	public ActionFoword execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String img = request.getParameter("img");
		String msg = null;
		
		if(name != null && img !=null){
			
			if (name.equals("w")) {
				msg = "img1.PNG,img2.PNG,img3.PNG,img4.PNG,img5.PNG";
			} else if(name.equals("s")){
				msg = "img6.PNG,img7.PNG,img8.PNG,img9.PNG,img10.PNG,img11.PNG,img12.PNG,img13.PNG";
			} else if (name.equals("b")){
				msg = "img14.PNG,img15.PNG,img16.PNG,img17.PNG,img18.PNG";
			}
			
			
		} else{
			if (name.equals("w")) {
				msg = "선예,예은,소희,유빈,예은";
			} else if(name.equals("s")){
				msg = "제시카,티파니,유리,수영,써니,효연,윤아,서현";
			} else if (name.equals("b")){
				msg = "탑,승리,대성,G드래곤,태양";
			}
		}
		
		
		request.setAttribute("msg", msg);
		return new ActionFoword("ajaxres.jsp", false);
	}

}
