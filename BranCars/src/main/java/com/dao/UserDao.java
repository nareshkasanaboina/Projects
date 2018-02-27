package com.dao;

import java.util.ArrayList;


import com.beans.UserBean;


public interface UserDao {
	public String login(UserBean u);
	public String forgot(UserBean u);
	public String addcar(UserBean u);
	
	
	ArrayList<UserBean>viewallcars();
	ArrayList<UserBean>searchcar(int carid);
	ArrayList<UserBean>updatecar(int carid);
	ArrayList<UserBean>deletecar(int carid);
	ArrayList<UserBean>buycar(int carid);
	
}
