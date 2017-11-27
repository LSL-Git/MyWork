package com.demo3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckUserServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message = "";

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		String value1 = "",value2 = "";
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				cookie = cookies[i];
//				System.out.println(cookie.getName());
				if (cookie.getName().equals("username")) {
					value1 = cookie.getValue();
				}
				if (cookie.getName().equals("password")) {
					value2 = cookie.getValue();
				}
			}
			if (value1.equals("admin") && value2.equals("admin")) {
				message = "欢迎您！" + value1 + "再次登录该页面！";
				request.getSession().setAttribute("message", message);
				response.sendRedirect("ch3/welcome.jsp");
			} else {
				response.sendRedirect("ch3/Login.jsp");
			}
		} else {
			response.sendRedirect("ch3/Login.jsp");
		}
	}

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
		doGet(request, response);
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("username").trim();
		String psw = request.getParameter("password").trim();
		if (!name.equals("admin") || !psw.equals("admin")) {
			message = "用户名或口令不正确！请重试！";
			request.getSession().setAttribute("message", message);
			response.sendRedirect("ch3/Login.jsp");
		} else {
			if ((request.getParameter("check")) != null && (request.getParameter("check")).equals("check")) {
				Cookie nameCookie = new Cookie("username", name);
				Cookie pswCookie = new Cookie("password", psw);
				nameCookie.setMaxAge(60 * 60);
				pswCookie.setMaxAge(60 * 60);
				response.addCookie(nameCookie);
				response.addCookie(pswCookie);
			}
			message = "登陆成功!";
			request.getSession().setAttribute("message", message);
			response.sendRedirect("ch3/welcome.jsp");
		}
	}

}
