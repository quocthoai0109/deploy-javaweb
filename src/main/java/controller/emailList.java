package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
/**
 * Servlet implementation class emailList
 */
@WebServlet("/emailList")
public class emailList extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url ="/index.html";
		String action= req.getParameter("action");
		if (action==null)
			action="join";
		if (action.equals("join"))
			url="/index.html";
		else if (action.equals("add")) {
			String firstName = req.getParameter("firstName");
			String lastName = req.getParameter("lastName");
			String email = req.getParameter("email");
			
			User user = new User (firstName,lastName,email);
			//UserDb.insert(user);
			
			req.setAttribute("user", user);
			url="/thanks.jsp";
			}
		getServletContext().getRequestDispatcher(url).forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

}
