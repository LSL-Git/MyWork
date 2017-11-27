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
		// 指定页面在传输过程中使用的编码方式
		response.setHeader("Content-Encoding", "gb2312");
		// 设置响应内容类型
		response.setContentType("application/vnd.ms-excel;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.println("学号\t姓名\t性别\t年龄\t所在系");
		out.println("950001\t李勇\t男\t23\t计算机");
		out.println("950002\t李晨\t女\t21\t计算机");
		out.flush();
		out.close();
	}

}
