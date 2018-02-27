package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.dao.Methods;


public class CoffeImpl implements Methods {
 static 	Scanner sc=new Scanner(System.in);
	
	int a=1;
	
	public void add() {
		Connection con = DBConnetion.getMySQLConnection();
		PreparedStatement ps = null;

		try{
			while(a==1){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Adding The Ingredients ");
		
		
		System.out.println(" Enter The  Name");
		String name = sc.next();
		
		System.out.println("  Enter The  Milk powder Kg");
		int powder = sc.nextInt();
		System.out.println(" Enter The  Water Ltr ");

		int water = sc.nextInt();
		System.out.println(" Enter The  Suger Kg");
		int suger = sc.nextInt();
		System.out.println(" Enter The Coffi Cost 15 Rs");
		double cost = sc.nextDouble();
		System.out.println(" Enter The Cups of Quantity");
		double quantity = sc.nextDouble();
		ps = con.prepareStatement(
				"insert into coffe.coffitable (name,powder,water,suger,cost,quantity) values (?,?,?,?,?,?)");
		ps.setString(1, name);
		ps.setInt(2, powder);
		ps.setInt(3, water);
		ps.setInt(4, water);
		ps.setDouble(5, cost);
		ps.setDouble(6, quantity);
		
		int i = ps.executeUpdate();

		if (i == 1) {
			System.out.println(" Record Insertd");
		} else {
			System.out.println(" Record Not Insertd");
		}
		

		System.out
		.println("Do you want to Add More Coffees  please press 1 else 2");
a = sc.nextInt();
		
		}
			
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		

		
		
		
		

	}

	
	@Override
	public void update() {
		int b=1;
		try {
			while(b==1){
				
		
			Connection con = DBConnetion.getMySQLConnection();
			PreparedStatement ps = null;
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter The  Id");
			int id = sc.nextInt();

			System.out.println(" Enter The Updated Name");
			String name = sc.next();
			System.out.println(" Enter The Updated Milk Powder Kg");
			int powder = sc.nextInt();
			System.out.println("Enter The Updated Water Ltr");

			int water = sc.nextInt();
			System.out.println(" Enter The Updated Suger Kg");
			int suger = sc.nextInt();
			System.out.println(" Enter The Cost Rs");
			double cost = sc.nextDouble();
			System.out.println(" Enter The Quantity");
			double quantity = sc.nextDouble();
			

			ps = con.prepareStatement(
					"update coffe.coffitable  set name=?,powder=?,water=?,suger=?,cost=?,quantity=? where id=?");

			ps.setString(1, name);
			ps.setInt(2, powder);
			ps.setInt(3, water);
			ps.setInt(4, suger);
			ps.setDouble(5, cost);
			ps.setDouble(6, quantity);
			ps.setInt(7, id);
			

			int i = ps.executeUpdate();
			if (i == 1) {
				System.out.println("Record updated");
			} else {
				System.out.println("Record NOT updated");
			}
			System.out
			.println("Do you want to Update More Coffees  please press 1 else 2");
	b = sc.nextInt();
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}

	@Override
	public void view() {
		Scanner sc=new Scanner(System.in);
		int k=1;
	
	
		try {
			while(k==1){
				
		Connection con = DBConnetion.getMySQLConnection();
		PreparedStatement ps = null;

		ResultSet rs = null;

		ps = con.prepareStatement("SELECT * FROM coffe.coffitable");

		rs = ps.executeQuery();
		System.out.println
		(" Coffee ID ||  Coffee Name  || Coffiee Powder  ||     Water     ||  Suger  ||   Price   ||   Quantity  || ");
		while (rs.next()) {
			System.out.println( "    "+ rs.getInt(1) + "           " + rs.getString(2)+ "            " + rs.getInt(3)+" Kg"+ "            " + rs.getInt(4)+"Ltr"
					+ "         " + rs.getInt(5)+" Kg" + "       " + rs.getDouble(6)+" Rs"+ "         " + rs.getDouble(7 ));
		}
		
		
		System.out
		.println("Do you want to see again  please press 1 else 2");
k = sc.nextInt();
		}

	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void buy() {
		int c=1;
		double dbqty=0;
		double dbprice=0;
		double bill=0;
		int dbwater=0;
		int dbpowder=0;
		int dbsugar=0;
		

		try {
			
			while(c==1){
			Connection con = DBConnetion.getMySQLConnection();
			PreparedStatement ps = null;
			ResultSet rs = null;
			Scanner sc = new Scanner(System.in);
			int k = 0;
			
			ps = con.prepareStatement("select id, name from coffe.coffitable;");
			rs=ps.executeQuery();
			System.out.println("Id\t Name");
			while (rs.next()) 
			{
				
				System.out.println( rs.getInt(1)+"\t"+rs.getString(2));
				
				
			}
			System.out.println("Select Your Option");
			int id=sc.nextInt();
			
			 ps=con.prepareStatement("SELECT powder, water,suger,quantity,cost from coffe.coffitable where  id =?");
		 
			 ps.setInt(1, id);
		
			rs=ps.executeQuery();
			
			
			
			
			
			while(rs.next())
			{
				
				System.out.println("Available Quantity="+rs.getInt(1)+"\n"+"Price Per Quantity="+rs.getDouble(5));
				
				dbpowder=rs.getInt(1);
					dbwater=rs.getInt(2);
						dbsugar=rs.getInt(3);
						
				dbqty=rs.getInt(1);
				dbprice=rs.getDouble(5);
				
				
				
			
			}
	
		System.out.println(" How many Coffies ?");
		double updatequantity1 = sc.nextDouble();
		
		
		dbpowder=(int) (dbpowder-updatequantity1);
		
			dbsugar=(int) (dbsugar-updatequantity1);
		
		dbwater=(int) (dbwater-updatequantity1);
				
		
		bill=updatequantity1*dbprice;
		updatequantity1=dbqty-updatequantity1;
		if(updatequantity1>=0)
		{
		
			//System.out.println("Qty remaining="+updatequantity1);
		
		ps = con.prepareStatement("update coffe.coffitable  set quantity=?,powder=?, water=?,suger=? where id=?");

		ps.setDouble(1, updatequantity1);
		ps.setInt(2, dbpowder);
		ps.setInt(3,dbwater);
		ps.setInt(4,dbsugar);
		ps.setInt(5, id);
		
	
		
		
		int i = ps.executeUpdate();	
		
		if(i==1)
		{
			
			
			System.out.println("---------BILL---------------");
			System.out.println( " You Need To pay  Amount "+bill);
		
		System.out.println("Enter The Amount ");
		double amount=sc.nextDouble();
		
		
		if(amount==bill){
			System.out.println("Thank You Sir/Madam");
			
		}
		
		
			else if(amount>=bill){
			double a=amount-bill;
			
			System.out.println("Please Take Change Sir/Madam "+a);
			
		}
		else if(amount<bill){
			
			double b=bill-amount;
			System.err.println("Sorry give More Amount  "+b);
			
		
			
			double finalamount=sc.nextDouble();
			if( b==finalamount){
				System.out.println("Thank  you Sir/Madam  ");
			}
			
		}
		
		}
		}
			
			else
			{
				System.out.println("Qty Is  Insufficent Plese Enter The Low Quantity");
			}
		
		
		System.out
		.println("Do you want to see again  please press 1 else 2");
c = sc.nextInt();
		
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
		
		
	}


	@Override
	public void bill() {
		
		
	}


	@Override
	public void blackcoffee() {
		Connection con = DBConnetion.getMySQLConnection();
		PreparedStatement ps = null;
		int k=1;

		try{
			while(k==1){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Adding Black Coffee The Ingredients ");
		
		
		System.out.println(" Enter The  Name");
		String name = sc.next();
		
		System.out.println("  Enter The  blackpowder Kg");
		int powder = sc.nextInt();
		System.out.println(" Enter The  Water Ltr ");

		int water = sc.nextInt();
		System.out.println(" Enter The  Suger Kg");
		int suger = sc.nextInt();
		System.out.println(" Enter The Black Coffee 25 Cost Rs");
		double cost = sc.nextDouble();
		System.out.println(" Enter The Cups of Quantity");
		double quantity = sc.nextDouble();
		ps = con.prepareStatement(
				"insert into coffe.coffitable (name,powder,water,suger,cost,quantity) values (?,?,?,?,?,?)");
		ps.setString(1, name);
		ps.setInt(2, powder);
		ps.setInt(3, water);
		ps.setInt(4, water);
		ps.setDouble(5, cost);
		ps.setDouble(6, quantity);
		
		int i = ps.executeUpdate();

		if (i == 1) {
			System.out.println(" Record Insertd");
		} else {
			System.out.println(" Record Not Insertd");
		}
		System.out.println("Do you want to Add again  please press 1 else 2");
		k = sc.nextInt();
				
					}
		
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}


	@Override
	public void greentea() {
		Connection con = DBConnetion.getMySQLConnection();
		PreparedStatement ps = null;
 int k=1;
		try{
			
			while(k==1){
				
			
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Adding Green Tea The Ingredients ");
		
		
		System.out.println(" Enter The  Name");
		String name = sc.next();
		
		System.out.println("  Enter The Green  Tea powder Kg");
		int powder = sc.nextInt();
		System.out.println(" Enter The  Water Ltr ");

		int water = sc.nextInt();
		System.out.println(" Enter The  Suger Kg");
		int suger = sc.nextInt();
		System.out.println(" Enter The Green Tea 30 Cost Rs");
		double cost = sc.nextDouble();
		System.out.println(" Enter The Cups of Quantity");
		double quantity = sc.nextDouble();
		ps = con.prepareStatement(
				"insert into coffe.coffitable (name,powder,water,suger,cost,quantity) values (?,?,?,?,?,?)");
		ps.setString(1, name);
		ps.setInt(2, powder);
		ps.setInt(3, water);
		ps.setInt(4, water);
		ps.setDouble(5, cost);
		ps.setDouble(6, quantity);
		
		int i = ps.executeUpdate();

		if (i == 1) {
			System.out.println(" Record Insertd");
		} else {
			System.out.println(" Record Not Insertd");
		}
		
		System.out.println("Do you want to Add again  please press 1 else 2");
		k = sc.nextInt();
				
					}
		
		
		
		}
			
			
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}


	@Override
	public void tea() {
		Connection con = DBConnetion.getMySQLConnection();
		PreparedStatement ps = null;
int k=1;

		try{
			while(k==1){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Adding  Tea The Ingredients ");
		
		
		System.out.println(" Enter The  Name");
		String name = sc.next();
		
		System.out.println("  Enter The  Tea powder Kg");
		int powder = sc.nextInt();
		System.out.println(" Enter The  Water Ltr ");

		int water = sc.nextInt();
		System.out.println(" Enter The  Suger Kg");
		int suger = sc.nextInt();
		System.out.println(" Enter The  Tea  Cost 15 Rs");
		double cost = sc.nextDouble();
		System.out.println(" Enter The Cups of Quantity");
		double quantity = sc.nextDouble();
		ps = con.prepareStatement(
				"insert into coffe.coffitable (name,powder,water,suger,cost,quantity) values (?,?,?,?,?,?)");
		ps.setString(1, name);
		ps.setInt(2, powder);
		ps.setInt(3, water);
		ps.setInt(4, water);
		ps.setDouble(5, cost);
		ps.setDouble(6, quantity);
		
		int i = ps.executeUpdate();

		if (i == 1) {
			System.out.println(" Record Insertd");
		} else {
			System.out.println(" Record Not Insertd");
		}
		
		System.out.println("Do you want to Add again  please press 1 else 2");
		k = sc.nextInt();
				
					}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
