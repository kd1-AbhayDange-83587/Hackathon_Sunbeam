package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.DbUtil.DbUtil;

public class UserDao implements AutoCloseable{
	private Connection connection;
	
	public UserDao() throws SQLException {
		connection = DbUtil.getConnection();
	}
	
	public int checkForUserCreds(Scanner sc, String email, String password) throws SQLException {
		int userID = -1 ;
		String sql = "Select * from User where email = ? and password = ?";
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setString(3, email);
			stmt.setString(4, password);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				if(rs.getString(3).equals(email) && rs.getString(4).equals(password)) {
					userID = rs.getInt(1);
					System.out.println("Login Successful");
					return userID;
				}
				else {
					System.out.println("Invalid Credentials");
					return userID;
				}
			}
		}
		return userID;
	}

	@Override
	public void close() throws Exception {
		if(connection != null)
			connection.close();
		
	}
}
