package com.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnetion {
	public static Connection getOracleConnection(){
		Connection con=null;
		String drivername="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String password="hr";
		try {
			Class.forName(drivername);
			con=DriverManager.getConnection(url,user,password);
			if(con!=null){
				System.out.println("connected");
			}else{
				System.out.println("connection fail");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	public static Connection getMySQLConnection(){
		Connection con=null;
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/Coffe";
		String user="root";
		String password="root";
		try {
			Class.forName(driver);
			 con=DriverManager.getConnection(url, user, password);
			 if(con!=null){
				 System.out.println("connected");
			 }
			 else{
				 System.out.println("not connected");
			 }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
}
