package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.UserBean;

import com.daoimpl.UserDaoImpl;

/**
 * Servlet implementation class serchcar
 */
@WebServlet(name = "searchcar", urlPatterns = { "/searchcar" })
public class serchcar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serchcar() {
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
		UserBean  u=new UserBean();
		//b.setBankId(Integer.parseInt(request.getParameter("bankId")));
		
		System.out.println("in servletttttttttt"+u.getCarname());
		u.setCar_id(Integer.parseInt("car_id"));
		 UserDaoImpl daoimpl =new UserDaoImpl();
		 
		ArrayList<UserBean> carlist=daoimpl.searchcar(u.getCar_id());
		
	
		if(carlist!=null){
			request.setAttribute("carlist", carlist);
			RequestDispatcher rd=request.getRequestDispatcher("Addcar.html");
			rd.forward(request, response);
			}
		else{
			
			RequestDispatcher	rd=request.getRequestDispatcher("AdminHome.jsp");
			rd.forward(request, response);
		}
		
	}

}
