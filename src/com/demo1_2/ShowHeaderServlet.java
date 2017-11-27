package com.demo1_2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowHeaderServlet extends HttpServlet {

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
	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>Http 请求头信息</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("<p>服务器收到的请求头信息</p>");
		out.print(request.getMethod() + " | " 
				+ request.getRequestURL() + " | "
				+ request.getQueryString() + " | "
				+ request.getProtocol() + "<br/>");
		
		Enumeration<String> headers = request.getHeaderNames(); // 请求得到一个enumeration对象
		while (headers.hasMoreElements()) {
			String header = (String) headers.nextElement();
			String value = request.getHeader(header);
			out.print(header + " = " + value + "<br/>");
		}
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
