package com.test.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.beans.User;
import com.test.dao.ApplicationDao;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//collect register form data
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");

		
		//fill the bean
		User user=new User (username,password,firstName,lastName);

		
		//call dao and save user obj to database
		
		ApplicationDao dao=new ApplicationDao();
		
		dao.registerUser(user);
		
	
		
	}

}
