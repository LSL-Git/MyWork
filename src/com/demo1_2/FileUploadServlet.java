package com.demo1_2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUploadServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * �ϴ��ļ��洢Ŀ¼
	 */
	private static final String UPLOAD_DIRECTORY = "upload";
	
	// �ϴ�����
    private static final int MEMORY_THRESHOLD   = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE      = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE   = 1024 * 1024 * 50; // 50MB

    private String userName = "�У�";
    
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter writer = response.getWriter();

		// ����Ƿ�Ϊ��ý���ϴ�
		if (!ServletFileUpload.isMultipartContent(request)) {
			// ���������ֹͣ
			writer.println("Error: ��������� enctype=multipart/form-data");
            writer.flush();
            return;
		}
		// �����ϴ�����
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// �����ڴ��ٽ�ֵ �����󽫲�����ʱ�ļ����洢����ʱĿ¼��
		factory.setSizeThreshold(MEMORY_THRESHOLD);
		// ������ʱ�洢Ŀ¼
		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
		
		ServletFileUpload upload = new ServletFileUpload(factory);
		// ��������ϴ��ļ�ֵ
		upload.setFileSizeMax(MAX_FILE_SIZE);
		// �����������ֵ(�����ļ��ͱ�����)
		upload.setSizeMax(MAX_REQUEST_SIZE);
		// ���ñ���,��������
		upload.setHeaderEncoding("UTF-8");
		
		// ������ʱ·�����洢�ϴ��ļ�
		// ���·������ڵ�ǰӦ��Ŀ¼
		String uploadPath = getServletContext().getRealPath("/") + File.separator + UPLOAD_DIRECTORY;
		System.out.println(uploadPath);
		
		// ���Ŀ¼�������򴴽�Ŀ¼
		File uploadDir = new File(uploadPath);
		if (!uploadDir.exists()) {
			uploadDir.mkdir();
		}
		
		try {
			// ���������������ȡ�ļ�����
			List<FileItem> formItems = upload.parseRequest(request);
			//-------------------------------------
			// ������
			Iterator iter = formItems.iterator();
			while (iter.hasNext()) {
				FileItem item = (FileItem) iter.next();
				
				if (item.isFormField()) {
					//item.getFieldName();
					userName = item.getString();
					// ����ת��
					userName = new String(userName.getBytes("ISO-8859-1"),"UTF-8");
				}
			}
			//---------------------------------------
			if (formItems != null && formItems.size() > 0) {
				// ����������
				for (FileItem item : formItems) {
					// �����ڱ��е�����
					if (!item.isFormField()) {
						// ��ȡ�ϴ��ļ���
						String fileName = new File(item.getName()).getName();
						// ƴ���ϴ��ļ�·��
						String filePath = uploadPath + File.separator + fileName;
						File storeFile = new File(filePath);
						// ����̨����ļ��ϴ�·��
						System.out.println(filePath);
						// �����ļ���Ӳ��
						item.write(storeFile);
						// ����message����
						request.setAttribute("message","<h2>�ļ��ϴ��ɹ���</h2>" + "�û���" + userName + "<br>�ļ���: " + fileName);
					}
				}
			}
		} catch (Exception e) {
			request.setAttribute("message", "�ļ��ϴ�ʧ��:" + e.getMessage());
		}
		// ��ת��message.jsp
		getServletContext().getRequestDispatcher("/message.jsp").forward(request, response);
	}

}
