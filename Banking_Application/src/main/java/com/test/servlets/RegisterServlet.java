package com.test.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.test.beans.User;
import com.test.dao.userDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	private userDao userdao = new userDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append("Served at: ").append(req.getContextPath());
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WebContent/jsp/login.jsp");
		dispatcher.forward(req, resp);


	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstName = request.getParameter("firstname");

		String lastName = request.getParameter("lastname");

		String username = request.getParameter("username");

		String password = request.getParameter("password");

		User user = new User();

		user.setFirstname(firstName);
		user.setLastname(lastName);
		user.setUsername(username);
		user.setPassword(password);  

		try {
			userDao.registerEmployee(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WebContent/jsp/login.jsp");
		dispatcher.forward(request, response);

	}

	

}
