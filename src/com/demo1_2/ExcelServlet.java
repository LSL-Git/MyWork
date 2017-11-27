package com.demo1_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExcelServlet extends HttpServlet {

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
		// ָ��ҳ���ڴ��������ʹ�õı��뷽ʽ
		response.setHeader("Content-Encoding", "gb2312");
		// ������Ӧ��������
		response.setContentType("application/vnd.ms-excel;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.println("ѧ��\t����\t�Ա�\t����\t����ϵ");
		out.println("950001\t����\t��\t23\t�����");
		out.println("950002\t�\tŮ\t21\t�����");
		out.flush();
		out.close();
	}

}
