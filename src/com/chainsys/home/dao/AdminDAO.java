package com.chainsys.home.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.home.model.Admin;
import com.chainsys.home.util.ConnectionUtil;

public class AdminDAO {
	public void addDetails(Admin admin) throws Exception {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into admin(id,name,location,address,phone_no,price,status) values(admin_admin_id_seq.NEXTVAL,?,?,?,?,?,?)";
			PreparedStatement preparedstatement = connection
					.prepareStatement(sql);
			preparedstatement.setString(1, admin.getAdminName());
			preparedstatement.setString(2, admin.getLocation());
			preparedstatement.setString(3, admin.getAddress());
			preparedstatement.setLong(4, admin.getPhoneNumber());
			preparedstatement.setInt(5, admin.getPrice());
			preparedstatement.setInt(6, admin.getStatus());
			preparedstatement.executeUpdate();
			ConnectionUtil.close(connection, preparedstatement, null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Admin checkLogin(Admin admin) {
		Admin administration = null;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select name from admin where name=?";
			PreparedStatement preparedstatement = connection
					.prepareStatement(sql);
			String name = admin.getAdminName();
			preparedstatement.setString(1, name);
			preparedstatement.executeUpdate();
			ConnectionUtil.close(connection, preparedstatement, null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return administration;
	}

	public void findbyid(int id) throws Exception {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "update admin set status =? where id=?";
			PreparedStatement preparedstatement = connection
					.prepareStatement(sql);
			preparedstatement.setInt(1, 0);
			preparedstatement.setInt(2, id);
			preparedstatement.executeUpdate();
			ConnectionUtil.close(connection, preparedstatement, null);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
