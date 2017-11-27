package com.demo3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GuessNumberServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int count = 0;

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
		count = 0;

		// 创建0-100的随机数
		int magic = (int) (Math.random() * 101);
		// 创建会话对象
		HttpSession session = request.getSession();
		// 将随机数作为会话属性存储到会话中,名为 num
		session.setAttribute("num", new Integer(magic));
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>猜数字</TITLE></HEAD>");
		out.println("  <BODY>");
		out.println("想出一个0到100之间的数，请你猜!<br/>");
		out.println("<form action='GuessNumberServlet.do' method='post'>");
		out.println("<input type='text' name='guess'/>");
		out.println("<input type='submit' value='确定'/>");
		out.println("</form>");
		out.println("  <br><br><a href=\"index.jsp\">首页</a> </BODY>");
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
		count++;
		// 获取用户输入的数值
		int guess = Integer.parseInt(request.getParameter("guess"));
		// 获取会话对象
		HttpSession session = request.getSession();
		// 获取会话中名为 num 属性的值
		int magic = (Integer) session.getAttribute("num");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>猜数字</TITLE></HEAD>");
		out.println("  <BODY>");
		if (guess == magic) {
			// 销毁会话对象
			session.invalidate();
			out.println("祝贺你，答对了！<br/>你一共猜了 " + count + " 次");
			out.println("<br/><a href=\"GuessNumberServlet.do\">再猜一次</a><br/>");
		} else if(guess > magic){
			out.println("猜大了，请重新猜！");
		} else {
			out.println("猜小了，请重新猜！");
		}
		out.println("<form action='GuessNumberServlet.do' method='post'>");
		out.println("<input type='text' name='guess'/>");
		out.println("<input type='submit' value='确定'/>");
		out.println(" </form> <br><br><a href=\"index.jsp\">首页</a></BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
