package com.beans;

import java.io.Serializable;


public class CoffiUser  implements Serializable{
	public int Milk_id;
	public String milk;
	public String withoutmilk;
	public String bluecoffie;
	public String boost;
	public int water;
	public int suger;
	public double cost;
	public double quantity;
	public int powder;
	
	public int role_id;
	
	public String role_name;

	public  double total=quantity*cost;
	public double stock= 0;
	public double stock1= stock-quantity;
	
	
	

	public int getMilk_id() {
		return Milk_id;
	}

	public void setMilk_id(int milk_id) {
		Milk_id = milk_id;
	}

	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}

	public String getWithoutmilk() {
		return withoutmilk;
	}

	public void setWithoutmilk(String withoutmilk) {
		this.withoutmilk = withoutmilk;
	}

	public String getBluecoffie() {
		return bluecoffie;
	}

	public void setBluecoffie(String bluecoffie) {
		this.bluecoffie = bluecoffie;
	}

	public String getBoost() {
		return boost;
	}

	public void setBoost(String boost) {
		this.boost = boost;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getSuger() {
		return suger;
	}

	public void setSuger(int suger) {
		this.suger = suger;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	

	public int getPowder() {
		return powder;
	}

	public void setPowder(int powder) {
		this.powder = powder;
	}
	

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public double getStock1() {
		return stock1;
	}

	public void setStock1(double stock1) {
		this.stock1 = stock1;
	}

	@Override
	public String toString() {
		return "CoffiUser [Milk_id=" + Milk_id + ", milk=" + milk + ", withoutmilk=" + withoutmilk + ", bluecoffie="
				+ bluecoffie + ", boost=" + boost + ", water=" + water + ", suger=" + suger + ", cost=" + cost
				+ ", quantity=" + quantity + ", powder=" + powder + ", role_id=" + role_id + ", role_name=" + role_name
				+ ", total=" + total + ", stock=" + stock + ", stock1=" + stock1 + "]";
	}

	
	
	
	
	
	

}
