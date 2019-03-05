package com.chainsys.home.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.chainsys.home.model.Admin;
import com.chainsys.home.util.ConnectionUtil;

public class SearchHomeDAO {
	public ArrayList<Admin> searchhome(String location) throws SQLException {
		ArrayList<Admin> list = new ArrayList<Admin>();

		Connection connection = ConnectionUtil.getConnection();
		String sql = "select admin_id,admin_name,address,location,price,phone_no,status from admin where location=? and status=1";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, location);
		ResultSet resultset = preparedStatement.executeQuery();
		Admin admin;
		while (resultset.next()) {
			admin = new Admin();
			admin.setAdminId(resultset.getInt("admin_id"));
			admin.setAdminName(resultset.getString("admin_name"));
			admin.setAddress(resultset.getString("address"));
			admin.setLocation(resultset.getString("location"));
			admin.setPrice(resultset.getInt("price"));
			admin.setPhoneNumber(resultset.getLong("phone_no"));
			
			list.add(admin);

		}
		return list;

	}

}
