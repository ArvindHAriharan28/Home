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

@WebServlet("/ForgetPasswordServlet")
public class ForgetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String security_question = request.getParameter("question");
		String security_answer = request.getParameter("answer");
		String password = request.getParameter("newpassword");
		Register register = new Register();
		register.setEmail(email);
		register.setPassword(password);
		register.setSecurity_question(security_question);
		register.setSecurity_answer(security_answer);
		RegisterDAO registerDAO = new RegisterDAO();
		try {
			registerDAO.findbyemail(register);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher req = request.getRequestDispatcher("login.jsp");
		req.forward(request, response);

	}

}
