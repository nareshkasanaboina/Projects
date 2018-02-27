package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.UserBean;
import com.daoimpl.UserDaoImpl;


/**
 * Servlet implementation class UserController
 */
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		response.setContentType("text/html");
		
		
		
		PrintWriter out = response.getWriter();
		UserBean u = new UserBean();
		UserDaoImpl userDAO = new UserDaoImpl();
		u.setUserName(request.getParameter("uname"));
		u.setPassWord(request.getParameter("pass"));
		
		String type = userDAO.login(u);
		if(type==null)
		{
			out.println("Please Enter Valid UserName / PassWord");
			RequestDispatcher rd = request.getRequestDispatcher("./signin.html");
			rd.include(request, response);
			
			
		}else if(type.equalsIgnoreCase("admin")){
			RequestDispatcher rd = request.getRequestDispatcher("./AdminHome.jsp");
			rd.forward(request, response);
		}else if(type.equalsIgnoreCase("user")){
			RequestDispatcher rd = request.getRequestDispatcher("./UserHome.jsp");
			rd.forward(request, response);
		}
	}

}
