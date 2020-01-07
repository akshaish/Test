package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.deloitte.bean.User;
import com.deloitte.service.LoginService;
import com.deloitte.service.LoginServiceImpl;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet(urlPatterns = {"/login","/create","/logout"})
public class TestServlet extends HttpServlet {

	
	public void init(ServletConfig config) throws ServletException {
	
		System.out.println("init called");
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy called");
	;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do get called");
		
			String name = request.getParameter("name");
			String desig = request.getParameter("desig");
			request.setAttribute("name", name);
			request.setAttribute("desig", desig);
		
			request.getRequestDispatcher("display.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do post called");
		doGet(request, response);
	}

}
