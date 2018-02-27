package com.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.beans.UserBean;

import com.dao.UserDao;
import com.db.ConnectionManager;




public class UserDaoImpl  implements UserDao{

	
	
	public String login(UserBean u) {
		
		
		
		String type=null;
		try {
			Connection con = ConnectionManager.getConnection();
			PreparedStatement ps = con.prepareStatement("select type from userdetails where username=? AND password = ?");
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getPassWord());
			ResultSet rs = ps.executeQuery();
			
			System.out.println(" comapring ");
			
			while(rs.next())
			{
				System.out.println(" ok ");
				
				type=rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return type;
	
	}
	public String forgot(UserBean u) {
		String password=null;
		try {
			Connection con = ConnectionManager.getConnection();
			PreparedStatement ps = con.prepareStatement("select password from test.userdetails where username=? AND question = ? AND answer=?");
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getQuestion());
			ps.setString(3, u.getAnswer());
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				password=rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return password;
	}

	

	public String addcar(UserBean u) {
		
		String status="";
		/*
		SELECT  carname,carmodel,carcolour,cost,quantity,brand_id  from test.car where car_id=1
		
		*/try {
			Connection con=ConnectionManager.getConnection();
			PreparedStatement ps=con.prepareStatement
					("insert into test.car(carname,carmodel,carcolour,cost,quantity,brand_id) values(?,?,?,?,?,?)");
			
			
			
			ps.setString(1, u.getCarname());
			ps.setString(2, u.getCarmodel());
			ps.setString(3, u.getCarcolour());
			ps.setDouble(4, u.getCost());
			ps.setInt(5, u.getQuantity());
			ps.setInt(6, u.getBarnd_id());
			
			int i = ps.executeUpdate();//insert the enter the values 
			if (i == 1) {
				status = "success";
				System.out.println("------------");
			} else {
				status = "fail";
			}
		
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}
	public ArrayList<UserBean> viewallcars() {
		
		ArrayList<UserBean>carlist=new ArrayList<UserBean>();
	
		
		//creating array list 
		try {
			Connection con=ConnectionManager.getConnection(); 
			
			PreparedStatement  ps=con.prepareStatement
		("SELECT *from  test.car;");
			UserBean u=new UserBean();
			ps.setInt(1, u .getCar_id());
			ResultSet rs=ps.executeQuery();
			
			System.out.println(" comming tto impl");
			while(rs.next()){
			       u.getCar_id();
				
			/*	UserBean u=new UserBean();
				u.setCar_id(rs.getInt(1));
				u.setCarname(rs.getString(2));
				u.setCarmodel(rs.getString(3));
				u.setCarcolour(rs.getString(4));
			
				u.setCost(rs.getDouble(5));
				u.setQuantity(rs.getInt(6));
				u.setBarnd_id(rs.getInt(7));
				carlist.add(u);
				*/
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return carlist;
		
		
		
	}
		
		
		
		
		
	
	public ArrayList<UserBean> searchcar(int carid) {
		ArrayList<UserBean>carlist=new ArrayList<UserBean>();
		 try{
			 Connection con=ConnectionManager.getConnection();
				PreparedStatement ps=con.prepareStatement("SELECT * from test.car where  car_id =?");
			ResultSet rs=ps.executeQuery();
			System.out.println(" serched enter id");
	  
		
		
			while(rs.next()){
				System.out.println("------- comming to impl------->");
				UserBean u=new UserBean();
				
				u.setCar_id(rs.getInt(1));
				u.setCarname(rs.getString(2));
				u.setCarmodel(rs.getString(3));
				u.setCarcolour(rs.getString(4));
				u.setCost(rs.getDouble(5));
				u.setQuantity(rs.getShort(6));
				u.setBarnd_id(rs.getInt(7));
				carlist.add(u);
			}
			
		 }catch (SQLException e) {
				e.printStackTrace();
			}
			
			return carlist;
		
	}
	public ArrayList<UserBean> updatecar(int carid) {
		// TODO Auto-generated method stub
		return null;
	}
	public ArrayList<UserBean> deletecar(int carid) {
		// TODO Auto-generated method stub
		return null;
	}
	public ArrayList<UserBean> buycar(int carid) {
		// TODO Auto-generated method stub
		return null;
	}
}
	


		
	

