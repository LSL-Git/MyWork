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

		// ����0-100�������
		int magic = (int) (Math.random() * 101);
		// �����Ự����
		HttpSession session = request.getSession();
		// ���������Ϊ�Ự���Դ洢���Ự��,��Ϊ num
		session.setAttribute("num", new Integer(magic));
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>������</TITLE></HEAD>");
		out.println("  <BODY>");
		out.println("���һ��0��100֮������������!<br/>");
		out.println("<form action='GuessNumberServlet.do' method='post'>");
		out.println("<input type='text' name='guess'/>");
		out.println("<input type='submit' value='ȷ��'/>");
		out.println("</form>");
		out.println("  <br><br><a href=\"index.jsp\">��ҳ</a> </BODY>");
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
		// ��ȡ�û��������ֵ
		int guess = Integer.parseInt(request.getParameter("guess"));
		// ��ȡ�Ự����
		HttpSession session = request.getSession();
		// ��ȡ�Ự����Ϊ num ���Ե�ֵ
		int magic = (Integer) session.getAttribute("num");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>������</TITLE></HEAD>");
		out.println("  <BODY>");
		if (guess == magic) {
			// ���ٻỰ����
			session.invalidate();
			out.println("ף���㣬����ˣ�<br/>��һ������ " + count + " ��");
			out.println("<br/><a href=\"GuessNumberServlet.do\">�ٲ�һ��</a><br/>");
		} else if(guess > magic){
			out.println("�´��ˣ������²£�");
		} else {
			out.println("��С�ˣ������²£�");
		}
		out.println("<form action='GuessNumberServlet.do' method='post'>");
		out.println("<input type='text' name='guess'/>");
		out.println("<input type='submit' value='ȷ��'/>");
		out.println(" </form> <br><br><a href=\"index.jsp\">��ҳ</a></BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
