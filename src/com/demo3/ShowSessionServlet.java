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
		// �ỰĬ����Ч��Ϊ30����
		response.setContentType("text/html;charset=utf-8");
		// �����򷵻ػỰ����
		HttpSession session = request.getSession(true);
		String heading = null;
		// �ӻỰ�����м��� accessCount ����
		Integer accessCount = (Integer) session.getAttribute("accessCount");
		if (accessCount == null) {
			accessCount = new Integer(1);
			heading = "��ӭ�����״ε�¼��ҳ�棡";
		} else {
			accessCount += 1;
			heading = "��ӭ�����ٴε�¼��ҳ�棡";
		}
		// �� accessCount ��Ϊ���Դ洢���Ự������
		session.setAttribute("accessCount", accessCount);
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>�ػ�����ʾ��</TITLE></HEAD>");
		out.println("  <BODY><center>");
		out.println("<h3>" + heading + "<a href=\"ShowSessionServlet.do\"> �ٴη���</a></h3>");
		out.println("<table>");
		out.println("<tr bgcolor=\"#ffad00\"><td>��Ϣ</td><td>ֵ</td>\n");
		// �жϻỰ�����Ƿ�Ϊ��
		String state = session.isNew() ? "�»Ự" : "�ɻػ�";
		out.println("<tr><td>�Ự״̬��<td>" + state + "\n");
		out.println("<tr><td>�Ự ID��<td>" + session.getId() + "\n");
		out.println("<tr><td>����ʱ�䣺<td>" + new Date(session.getCreationTime()) + "\n");
		out.println("<tr><td>�������ʱ�䣺<td>" + new Date(session.getLastAccessedTime()) + "\n");
		out.println("<tr><td>��󲻻ʱ�䣺<td>" + session.getMaxInactiveInterval() + "\n");
		out.println("<tr><td>Cookie��<td>" + request.getHeader("Cookie") + "\n");
		out.println("<tr><td>�ѱ����ʴ�����<td>" + accessCount + "\n");
		out.println("</table>");
		out.println("<a href=\"index.jsp\">��ҳ</a>");
		out.println(" </center> </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
