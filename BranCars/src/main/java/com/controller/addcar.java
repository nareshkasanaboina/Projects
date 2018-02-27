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
 * Servlet implementation class addcar
 */
public class addcar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addcar() {
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
		
		System.out.println(" cooming to the text box ");
		
		
		PrintWriter out = response.getWriter();
		UserBean u=new UserBean();
		u.setCarname(request.getParameter("carname"));
		u.setCarmodel(request.getParameter("carmodel"));
		u.setCarcolour(request.getParameter("carcolour"));
		
		u.setCost(Double.parseDouble(request.getParameter("carcost")));
		u.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		u.setBarnd_id(Integer.parseInt(request.getParameter("brand_id")));
		
		UserDaoImpl userDAO = new UserDaoImpl();

		String type = userDAO.addcar(u);
		
		if(type==null){
		
			request.setAttribute("message","sorry enter try agin");
			RequestDispatcher rd=request.getRequestDispatcher("Addcar.html");
			rd.forward(request, response);
			
		}
		else if(type.equals("success")){
			request.setAttribute("message","success fully add ");
			RequestDispatcher rd=request.getRequestDispatcher("Addcar.html");
			rd.forward(request, response);
		}
		else if(type.equals("fail")){
			request.setAttribute("message","fail to add car ");
			RequestDispatcher rd=request.getRequestDispatcher("Addcar.html");
			rd.forward(request, response);
		}
		
		
		
		
		
		
		
		
	}

}
