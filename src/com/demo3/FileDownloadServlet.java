package com.demo3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileDownloadServlet extends HttpServlet {

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
		// ���������ļ���
		String fileName = request.getParameter("filename");
		System.out.println("�����ļ�����" + fileName);

		OutputStream os = response.getOutputStream();
		// ��ȡ������
		ServletContext context = getServletContext();
		if (fileName == null) {
			os.write("�����ļ�ѡ�����".getBytes());
			os.close();
			return;
		}
		// ��ȡ�����ļ�������
		InputStream is = context.getResourceAsStream("/WEB-INF/lib/" + fileName);
		// ��ȡ�ļ��ֽڴ�С
		int len = is.available();
		// ������Ӧ���ĵ�MIME����
		response.setContentType("application/force-download");
		response.setHeader("Content-Length", String.valueOf(len));
		response.setHeader("Content-Disposition", "attachment;filename=\"" + fileName + "\"");
		// �����ļ�������ͻ���
		byte[] bytearr = new byte[1024];
		int byteread = 0;
		while((byteread = is.read(bytearr)) != -1) {
			os.write(bytearr,0,byteread);
		}
		
		os.flush();
		is.close();
	}

}
