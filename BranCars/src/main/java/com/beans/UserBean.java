package com.beans;

import java.io.Serializable;




public class UserBean implements Serializable {
	
	public int userId;
	public String userName;
	public String passWord;
	public String type;
	public String emailId;
	public long mobileNo;
	public String question;
	public String answer;
	public int role_id;
	public int car_id;	
	public String carmodel;
	public String carname;
	public String barnd_name;
	public int barnd_id;
	
	
	public double cost;
	public String carcolour;
	public int quantity;
	public double total=quantity*cost;

	public UserBean() {
		// TODO Auto-generated constructor stub
	}

	public UserBean(int userId, String userName, String passWord, String type, String emailId, long mobileNo,
			String question, String answer, int role_id, int car_id, String carmodel, String carname, String barnd_name,
			int barnd_id, double cost, String carcolour, int quantity, double total) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.type = type;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.question = question;
		this.answer = answer;
		this.role_id = role_id;
		this.car_id = car_id;
		this.carmodel = carmodel;
		this.carname = carname;
		this.barnd_name = barnd_name;
		this.barnd_id = barnd_id;
		this.cost = cost;
		this.carcolour = carcolour;
		this.quantity = quantity;
		this.total = total;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getBarnd_name() {
		return barnd_name;
	}

	public void setBarnd_name(String barnd_name) {
		this.barnd_name = barnd_name;
	}

	public int getBarnd_id() {
		return barnd_id;
	}

	public void setBarnd_id(int barnd_id) {
		this.barnd_id = barnd_id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getCarcolour() {
		return carcolour;
	}

	public void setCarcolour(String carcolour) {
		this.carcolour = carcolour;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userName=" + userName + ", passWord=" + passWord + ", type=" + type
				+ ", emailId=" + emailId + ", mobileNo=" + mobileNo + ", question=" + question + ", answer=" + answer
				+ ", role_id=" + role_id + ", car_id=" + car_id + ", carmodel=" + carmodel + ", carname=" + carname
				+ ", barnd_name=" + barnd_name + ", barnd_id=" + barnd_id + ", cost=" + cost + ", carcolour="
				+ carcolour + ", quantity=" + quantity + ", total=" + total + "]";
	}

	
	
}
