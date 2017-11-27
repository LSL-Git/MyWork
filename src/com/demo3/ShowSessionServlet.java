package com.demo3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowSessionServlet extends HttpServlet {

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
		// 会话默认有效期为30分钟
		response.setContentType("text/html;charset=utf-8");
		// 创建或返回会话对象
		HttpSession session = request.getSession(true);
		String heading = null;
		// 从会话对象中检索 accessCount 属性
		Integer accessCount = (Integer) session.getAttribute("accessCount");
		if (accessCount == null) {
			accessCount = new Integer(1);
			heading = "欢迎您，首次登录该页面！";
		} else {
			accessCount += 1;
			heading = "欢迎您，再次登录该页面！";
		}
		// 将 accessCount 作为属性存储到会话对象中
		session.setAttribute("accessCount", accessCount);
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>回话跟踪示例</TITLE></HEAD>");
		out.println("  <BODY><center>");
		out.println("<h3>" + heading + "<a href=\"ShowSessionServlet.do\"> 再次访问</a></h3>");
		out.println("<table>");
		out.println("<tr bgcolor=\"#ffad00\"><td>信息</td><td>值</td>\n");
		// 判断会话对象是否为新
		String state = session.isNew() ? "新会话" : "旧回话";
		out.println("<tr><td>会话状态：<td>" + state + "\n");
		out.println("<tr><td>会话 ID：<td>" + session.getId() + "\n");
		out.println("<tr><td>创建时间：<td>" + new Date(session.getCreationTime()) + "\n");
		out.println("<tr><td>最近访问时间：<td>" + new Date(session.getLastAccessedTime()) + "\n");
		out.println("<tr><td>最大不活动时间：<td>" + session.getMaxInactiveInterval() + "\n");
		out.println("<tr><td>Cookie：<td>" + request.getHeader("Cookie") + "\n");
		out.println("<tr><td>已被访问次数：<td>" + accessCount + "\n");
		out.println("</table>");
		out.println("<a href=\"index.jsp\">首页</a>");
		out.println(" </center> </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
