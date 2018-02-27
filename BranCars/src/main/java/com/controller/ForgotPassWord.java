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
 * Servlet implementation class ForgotPassWord
 */
public class ForgotPassWord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotPassWord() {
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
		
	   UserBean u=new UserBean();
		UserDaoImpl daoimpl=new UserDaoImpl();
		u.setUserName(request.getParameter("uname"));
		u.setQuestion(request.getParameter("question"));
		u.setAnswer(request.getParameter("answer"));
		u.setEmailId(request.getParameter("email"));
		String pass=daoimpl.forgot(u);
		
		if(pass==null)
		{
			out.println("User Doesnot exits please check once again");
			RequestDispatcher rd = request.getRequestDispatcher("./forgot.html");
			rd.include(request, response);
		}else{
			out.println("Your Forgoted PassWord is :  "+pass);
			RequestDispatcher rd = request.getRequestDispatcher("./signin.html");
			rd.include(request, response);
		
		
		}
		
	}

}
