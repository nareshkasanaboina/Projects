package com.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.daoimpl.CoffeImpl;

public class CoffiMachine {

	public static void main(String[] args) {

		menu();
		adminmenu();
		usermenu();
	}

	public static void menu() {

		Scanner sc = new Scanner(System.in);
		CoffeImpl cu = new CoffeImpl();
		CoffiDetails cd = new CoffiDetails();

		try {

			while (true) {

				System.out.println("***********************");
				System.out.println(" Welcome to CoffiMachine");
				System.out.println("***********************");
				System.out.println("1.Admin                ");
				System.out.println("2. User                 ");

				System.out.println(" Enter your Choice ");
				int ch = sc.nextInt();

				switch (ch) {
				case 1:

					adminmenu();

					break;
				case 2:
					usermenu();

					break;
				default:
					System.err.println("Please select choice range 1-2 only");

					break;

				}

			}

		} catch (InputMismatchException e) {

			System.err.println("  Enter The Numbers only");
			menu();
			e.printStackTrace();

		}
	}

	public static void adminmenu() {
		CoffeImpl ci = new CoffeImpl();
		Scanner sc = new Scanner(System.in);
		try {

			while (true) {
				System.out.println("******************************");
				System.out.println(" Welcome to ADMIN MENU        ");
				System.out.println("******************************");
				System.out.println("=======1.ADD THE COFFEE =======");
				System.out.println("=======2.UPDATE THE COFFEE=====");
				System.out.println("=======3.VIEW THE COFFEE=======");
				System.out.println("=======4.Back To MAIN MENU=====");

				System.out.println("  Enter The your choice ");
				int ch = sc.nextInt();

				switch (ch) {
				case 1:
					// ci.add();
					addcoffe();

					break;
				case 2:
					ci.update();

					break;
				case 3:
					ci.view();
					break;
				case 4:
					menu();
					break;

				default:
					System.err.println("Please Select Choice Range 1-2 only");

					break;

				}
			}
		} catch (InputMismatchException e) {
			adminmenu();
			System.err.println(" Enter The Numbers Only");

		}

	}

	public static void usermenu() {
		CoffeImpl ci = new CoffeImpl();
		Scanner sc = new Scanner(System.in);
		try {

			while (true) {

				System.out.println("******************************");
				System.out.println(" Welcome to USER MENU        ");
				System.out.println("******************************");
			
				System.out.println("=======1.BUY THE COFFEE =======");
				System.out.println("=======2.BACK TO MAIN MENU ===");

				System.out.println(" Enter your Choice ");
				int ch = sc.nextInt();

				switch (ch) {
//				case 1:
//					//addcoffe();
//					break;
				case 1:
					ci.buy();

					break;
				case 3:
					menu();

				default:
					System.err.println("Please select choice range 1 to 2 only");

					break;

				}
			}
		} catch (InputMismatchException e) {
			usermenu();
			System.err.println(" Enter The Numbers Only");

		}

	}

	public static void addcoffe() {
		CoffeImpl ci = new CoffeImpl();
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {

				System.out.println("==========1.Coffe======================");
				System.out.println("==========2.Black Coffee===============");
				System.out.println("==========3.Green Tea==================");
				System.out.println("==========4.Tea========================");
				System.out.println("==========5.BACK TO MAIN ADMIN MENU ===");
				System.out.println(" Enter Your Choice");
				int ch = sc.nextInt();

				switch (ch) {
				case 1:
					ci.add();
					break;
				case 2:
					ci.blackcoffee();

					break;

				case 3:
					ci.greentea();
					break;
				case 4:
					ci.tea();
					break;
				case 5:
					adminmenu();
					break;
				default:
					System.err.println("Please select choice range 1 to 5 only");

				}

			}
		} catch (InputMismatchException e) {
			addcoffe();
			System.err.println(" Enter The Numbers Only");
		}
	}

	/*public static void coffeemenu() {
		Scanner sc = new Scanner(System.in);

		
		
		try{
		while (true) {

			System.out.println("========== COFFEE MENU =================");
			System.out.println("==========1.Coffe           20.Rs=======");
			System.out.println("==========2.Black Coffee    25.Rs=======");
			System.out.println("==========3.Green Tea       30.Rs=======");
			System.out.println("==========4.Tea             15.Rs=======");

			System.out.println(" Enter Your Choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("Please select choice range 1 to 4 only");
			}
		}
		}catch (InputMismatchException e) {
			
			coffeemenu();
			System.err.println(" Enter The Numbers Only");
		}

	}*/

}
