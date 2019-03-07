package com.chainsys.home.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.home.dao.AdminDAO;
import com.chainsys.home.model.Admin;

@WebServlet("/AddLocationServlet")
public class AddLocationServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Integer id =Integer.parseInt( request.getParameter("id"));
		String adminName = request.getParameter("adminName");
		String location = request.getParameter("location");
		String address = request.getParameter("address");
		Long phonenumber = Long.parseLong(request.getParameter("phoneNumber"));
		int price = Integer.parseInt(request.getParameter("price"));

		Admin admin = new Admin();
		// admin.setId(id);
		admin.setAdminName(adminName);
		admin.setLocation(location);
		admin.setAddress(address);
		admin.setPhoneNumber(phonenumber);
		admin.setPrice(price);
		admin.setStatus(1);
		AdminDAO adminDAO = new AdminDAO();

		try {
			adminDAO.addDetails(admin);

			RequestDispatcher rd = request.getRequestDispatcher("success.html");
			rd.forward(request, response);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("failure.html");
			rd.forward(request, response);
		}

	}

}
