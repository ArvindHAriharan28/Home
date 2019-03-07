package com.chainsys.home.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.home.dao.RegisterDAO;
import com.chainsys.home.model.Register;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Register register = new Register();
		register.setEmail(email);
		register.setPassword(password);

		RegisterDAO registerDAO = new RegisterDAO();

		if (registerDAO.checkLogin(register)) {
			RequestDispatcher req = request.getRequestDispatcher("choose.jsp");
			req.forward(request, response);
		}

		else {
			String status = "Invalid Username and Password";
			request.setAttribute("STATUS", status);
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);

		}

	}

}
