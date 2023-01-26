package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.test.beans.User;

public class ApplicationDao {
	
	
	public void registerUser(User user) {

		try {
			//connect to database
			 Connection connection=DBConnection.getConnectionToDatabase();
			
			String query="insert into users values(?,?,?,?) ";
			
			//prepare statement
			PreparedStatement statement= connection.prepareStatement(query);
			statement.setString(0, ((User) user).getFirstname());
			statement.setString(1, user.getPassword());
			statement.setString(3, user.getFirstname());
			statement.setString(4, user.getLastname());


			statement.executeUpdate();

		}catch(SQLException exception) {
			exception.printStackTrace();
		}
	}

}
