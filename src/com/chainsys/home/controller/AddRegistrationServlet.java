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
import com.chainsys.home.validator.LoginValidator;


@WebServlet("/AddRegistrationServelt")
public class AddRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		Long phone = Long.parseLong(request.getParameter("phone"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String address = request.getParameter("address");		
		
		Register register=new Register();
		register.setName(name);
		register.setPhonenumber(phone);
		register.setEmail(email);
		register.setPassword(password);
		register.setAddress(address);
		RegisterDAO registerDAO=new RegisterDAO();
		LoginValidator loginValidator=new LoginValidator();
		String display;
		
		try
		{
			
			registerDAO.addUser(register);
			boolean statusMobile=loginValidator.mobileValid(phone.toString());
			if(statusMobile==true)
			{
			RequestDispatcher rd = request
					.getRequestDispatcher("login.html");
			rd.forward(request, response);
			}
			else
				
				
			{
				display="Ïnvalid Mobile Number";
				request.setAttribute("statusmobile", display);
			
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("failure.html");
			rd.forward(request, response);
		}
		
		
	}

}
