package com.chainsys.home.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.home.dao.SearchHomeDAO;
import com.chainsys.home.model.Admin;


@WebServlet("/SearchHomeServlet")
public class SearchHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String location = request.getParameter("location");
		SearchHomeDAO searchHomeDAO=new SearchHomeDAO();
		try
		{
			ArrayList<Admin> search=searchHomeDAO.searchhome(location);
			
			request.setAttribute("LOCATION",search);
			RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
			rd.forward(request,response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	
	}

}
