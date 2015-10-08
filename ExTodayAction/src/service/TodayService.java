package service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ActionFoword;

public class TodayService implements Service {

	@Override
	public ActionFoword execute(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		
		request.setAttribute("today", 
				new SimpleDateFormat("YYYY년 MM월 dd일 ").format(new Date()));
		return new ActionFoword("today.jsp", false);
	}

}
