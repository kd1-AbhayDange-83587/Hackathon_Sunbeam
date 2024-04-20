package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.dao.UserDao;
import com.sunbeam.entity.User;

public class Test {
	//For the Main Menu/First page of the Program... 
	public static int mainMenu(Scanner sc)	 {
		int choice;
		System.out.println("Welcome to Blogging App");
		System.out.println();
		System.out.println("0. Exit");
		System.out.println("1. Login");
		System.out.println("2. Register");
		choice= sc.nextInt();
		switch (choice) {
		case 0:
			System.out.println("Thankyou for using our App");
			return choice; // choice because I want to make the Menu driven cod continuous and this return choice will help me do so
		case 1:
			loginPage(sc);
			return choice;
		case 2:
			
			return choice;
		default:
			System.out.println("please Enter the valid Input");
			return choice;
		}
	}
	
	//For the case 1 login Page
	public static void loginPage(Scanner sc) {
		System.out.println("Please Login to continue");
		System.out.println();
		System.out.print("Email : ");
		String email = sc.next();
		System.out.print("Password : ");
		String password = sc.next();
		System.out.println();
		checkForCharacterForLogin(sc, email, password);
	}
	
	//To check the Line "Enter c to continue and e to exit from Application"
	public static void checkForCharacterForLogin(Scanner sc, String email, String password) {
		System.out.println("Enter c to continue and e to exit from the app");
		String character = sc.next();
		if(character.equals("c")) {
			ifCpressedInLogin(sc, email, password);
		}
		else if(character.equals("e")){
			mainMenu(sc);
		}
		else {
			System.out.println("Please Enter valid character");
			checkForCharacterForLogin(sc, email, password);
		}
	}
	
	public static void ifCpressedInLogin(Scanner sc, String email, String password) {
		try(UserDao ud = new UserDao()){
			int userID = ud.checkForUserCreds(sc, email, password);	
			AfterSuccessfulLoginBlogingPage(sc, userID);
		}			
		 catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//After the user name and password is inserted and checked in DB where the values are present after that this function is called
	public static void AfterSuccessfulLoginBlogingPage(Scanner sc, int userID) {
		System.out.println("Welcome <user>");
		System.out.println("1. Add Category");
		System.out.println("2. Show Categories");
		System.out.println("3. All Blogs");
		System.out.println("4. Add Blog");
		System.out.println("5. Edit Blog");
		System.out.println("6. Search Blog");
		System.out.println("7. Delete Blog");
		System.out.println("8. Logout");
	}
	
	public static void RegistrationPage(Scanner sc) {
		System.out.println("Please enter your details");
		System.out.println();
		System.out.println("Email -");
		String email = sc.next();
		System.out.println("Password - ");
		String password = sc.next();
		System.out.println("Full Name - ");
		String fullName = sc.nextLine();
		System.out.println("Phone Number - ");
		String phoneNo = sc.next();
		System.out.println("Enter c to continue and e to exit from the app");
		String character = sc.next();
		if(character.equals("c")) {
			
		}
		else if(character.equals("e")){
			mainMenu(sc);
		}
		else {
			System.out.println("Please Enter valid character");
			RegistrationPage(sc);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			choice = mainMenu(sc);
		} while (choice != 0);
	}

}
