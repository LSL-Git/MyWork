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
		// 接收下载文件名
		String fileName = request.getParameter("filename");
		System.out.println("下载文件名：" + fileName);

		OutputStream os = response.getOutputStream();
		// 获取上下文
		ServletContext context = getServletContext();
		if (fileName == null) {
			os.write("下载文件选择出错！".getBytes());
			os.close();
			return;
		}
		// 获取本地文件输入流
		InputStream is = context.getResourceAsStream("/WEB-INF/lib/" + fileName);
		// 获取文件字节大小
		int len = is.available();
		// 设置响应正文的MIME类型
		response.setContentType("application/force-download");
		response.setHeader("Content-Length", String.valueOf(len));
		response.setHeader("Content-Disposition", "attachment;filename=\"" + fileName + "\"");
		// 本地文件输出到客户端
		byte[] bytearr = new byte[1024];
		int byteread = 0;
		while((byteread = is.read(bytearr)) != -1) {
			os.write(bytearr,0,byteread);
		}
		
		os.flush();
		is.close();
	}

}
