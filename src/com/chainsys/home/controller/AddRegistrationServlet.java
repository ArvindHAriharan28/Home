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

@WebServlet("/AddRegistrationServlet")

public class AddRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		Long phone = Long.parseLong(request.getParameter("phone"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String security_question = request.getParameter("question");
		String security_answer = request.getParameter("answer");

		Register register = new Register();
		register.setName(name);
		register.setPhonenumber(phone);
		register.setEmail(email);
		register.setPassword(password);
		register.setAddress(address);
		register.setSecurity_question(security_question);
		register.setSecurity_answer(security_answer);
		RegisterDAO registerDAO = new RegisterDAO();

		try {

			Boolean status = registerDAO.checkRegister(register);
			if (status == false) {
				registerDAO.addUser(register);

				RequestDispatcher rd = request
						.getRequestDispatcher("login.jsp");
				rd.forward(request, response);

			} else {
				String display = "Email already Exists";
				request.setAttribute("status", display);
				RequestDispatcher rd = request
						.getRequestDispatcher("register.jsp");
				rd.forward(request, response);

			}

		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("failure.html");
			rd.forward(request, response);
		}

	}

}
