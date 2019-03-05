package com.chainsys.home.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.home.model.Register;
import com.chainsys.home.util.ConnectionUtil;

public class RegisterDAO {
	
	public void addUser(Register register) throws Exception{
		try
	{
		Connection connection = ConnectionUtil.getConnection();
		String sql="insert into register(name,phone_number,email,password,address) values(?,?,?,?,?)";
		PreparedStatement preparedstatement = connection
				.prepareStatement(sql);
		preparedstatement.setString(1, register.getName());
		preparedstatement.setLong(2, register.getPhonenumber());
		preparedstatement.setString(3, register.getEmail());
		preparedstatement.setString(4, register.getPassword());
		preparedstatement.setString(5, register.getAddress());
		preparedstatement.executeUpdate();
		ConnectionUtil.close(connection, preparedstatement, null);
	}
	catch(SQLException e)
		{
		e.printStackTrace();
		}

}
	public Boolean checkLogin(Register register) {
		Boolean isFound=false;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select email,password from register where email=? and password=?";
			PreparedStatement preparedstatement = connection
					.prepareStatement(sql);
			String email = register.getEmail();
			preparedstatement.setString(1, email);
			preparedstatement.setString(2, register.getPassword());
			
			ResultSet resultSet=preparedstatement.executeQuery();
			if(resultSet.next())
				
			{
				isFound=true;
			}
			else
			{
				isFound=false;
			}
			
			ConnectionUtil.close(connection, preparedstatement, null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isFound;
	}
	public void findbyemail(Register register) throws Exception{
		try
	{
		Connection connection = ConnectionUtil.getConnection();
		String sql="update register set password=? where email=?";
		PreparedStatement preparedstatement = connection.prepareStatement(sql);
		preparedstatement.setString(1,register.getPassword());
		preparedstatement.setString(2,register.getEmail());
		preparedstatement.executeUpdate();
		ConnectionUtil.close(connection, preparedstatement, null);
		
	}
	catch(SQLException e)
		{
		e.printStackTrace();
		}
	}


}
