package com.demo1_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleTestServlet extends HttpServlet {

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

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String quest1 = request.getParameter("quest1");
		String quest2 = request.getParameter("quest2");
		String[] quest3 = request.getParameterValues("quest3");
		String quest4 = request.getParameter("quest4").trim();
		
		int score = 0;
		if (quest1 != null && quest1.equals("1")) {
			score += 25;
		}
		if (quest2 != null && quest2.equals("3")) {
			score += 25;
		}
		if (quest3 != null && quest3.length == 2 && quest3[0].equals("1") && quest3[1].equals("3")) {
			score += 25;
		}
		if (quest4 != null && (quest4.equals("HttpServlet") || quest4.equals("javax.servlet.http.HttpServlet"))) {
			score += 25;
		}
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>测试结果</TITLE></HEAD>");
		out.println("  <BODY>");
		out.println("你的成绩是：" + score + "分");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
