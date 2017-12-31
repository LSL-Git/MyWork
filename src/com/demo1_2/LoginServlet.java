package com.demo1_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(name = "LoginServlet", urlPatterns = {"/login.do"});
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String upsw = request.getParameter("upsw");
		String check = request.getParameter("check");
		// 转换编码
		uname = new String(uname.getBytes("iso-8859-1"),"UTF-8");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <BODY>");
		// out.print("<h2>Name:" + uname + "<br />Psw:" + upsw + "</h2>");
		if ("瞌睡虫".equals(uname) && "admin".equals(upsw)) {
			// 创建并保存cookie
			if (check.equals("check")) {
//				uname = new String(uname.getBytes("UTF-8"),"iso-8859-1");
				System.out.println(uname);
				// 先编码再存入
				Cookie userCookie = new Cookie("username", java.net.URLEncoder.encode(uname,"utf-8"));
				userCookie.setMaxAge(60 * 60 * 24);
				response.addCookie(userCookie);
			}	
			response.sendRedirect("index.jsp");
//			out.print("<h1>登录成功！欢迎你：" + uname + "</h1>");
//			out.print("port:" + request.getRemotePort());
//			out.print("<a href='login.jsp'>login</a>");
		} else {
			out.print("对不起！您的用户名或密码不正确！");
		}
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
