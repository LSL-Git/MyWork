package com.demo1_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClientInfoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>客户端信息</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("<h3>客户端信息</h3>");
		out.print("<table border='1'>");
		out.print("<tr><td>客户机主机名</td>");
		out.print("<td>" + request.getRemoteHost() + "</td>");
		out.print("</tr>");
		out.print("<tr><td>客户IP地址</td>");
		out.print("<td>" + request.getRemoteAddr() + "</td>");
		out.print("</tr>");
		out.print("<tr><td>端口</td>");
		out.print("<td>" + request.getRemotePort() + "</td>");
		out.print("</tr>");
		out.print("<tr><td>请求方法</td>");
		out.print("<td>" + request.getMethod() + "</td>");
		out.print("</tr>");
		out.print("<tr><td>请求协议</td>");
		out.print("<td>" + request.getProtocol() + "</td>");
		out.print("</tr>");
		out.print("<tr><td>请求 URL</td>");
		out.print("<td>" + request.getRequestURL() + "</td>");
		out.print("</tr>");
		out.print("</table>");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
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
	}

}
