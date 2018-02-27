package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.beans.UserBean;
import com.daoimpl.UserDaoImpl;

/**
 * Servlet implementation class Viewall
 */
public class Viewall extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Viewall() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDaoImpl userDAO = new UserDaoImpl();
		ArrayList<UserBean> carlist=userDAO.viewallcars();
		
		if(carlist!=null){
			System.out.println("--------------->sucess fully view");
			
			request.setAttribute("carlist", carlist);
			RequestDispatcher rd=request.getRequestDispatcher("viewallcars.html");
			rd.forward(request, response);
			
			}
		
		else{
			
			RequestDispatcher	rd=request.getRequestDispatcher("AdminHome.jsp");
			rd.forward(request, response);
		}
		
	}

}
