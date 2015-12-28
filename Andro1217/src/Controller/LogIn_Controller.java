package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class LogIn_Controller
 */
@WebServlet("/LogIn_Controller")
public class LogIn_Controller extends HttpServlet {

	          
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String password = request.getParameter("password");

		String res =(id.equals("wwww3426")&& password.equals("123")) ? "1" : "0";
		HashMap<String, String> map= new HashMap<>();
		map.put("res", res);
		map.put("id", "wwww3426");        
		map.put("password", "123");
		
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json");

		PrintWriter out =response.getWriter();
		Gson  gson = new  Gson();
		
		out.append(gson.toJson(map).toString());
		out.flush();    
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
