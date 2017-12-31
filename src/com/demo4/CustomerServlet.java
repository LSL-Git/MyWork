package com.demo4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CustomerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("custName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		Custome custome = new Custome(name, email, phone);
		
		System.out.println(custome.getCustName() + " " + custome.getEmail() + " " + custome.getPhone());
		
		HttpSession session = request.getSession();
		synchronized (session) {
			session.setAttribute("customer", custome);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("ch4/displayCustomer.jsp");
		rd.forward(request, response);
		
	}

}
