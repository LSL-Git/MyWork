package com.demo3;

import java.io.File;

public class fileUtils {

	/**
	 * @param args
	 * �ļ�����
	 * @author LSL
	 */
	public static void main(String[] args) {
		String path = "E:/";
		
//		String p = System.getProperty("user.dir");
//		System.out.println(p);
		traverseFolder(path);
	}
	
	// �����ļ����µ���������
	public static void traverseFolder(String path) {
		File file = new File(path);
		System.out.println(file);
		if (file.exists()) {
			File[] files = file.listFiles();
			if (file.length() == 0) {
				System.out.println("�ļ����ǿյģ�");
			} else {
				for (File f : files) {
					if (f.isDirectory()) {
						System.out.println("�ļ���:" + f.getAbsolutePath());
						// �ݹ�
						traverseFolder(f.getAbsolutePath());
					} else {
						System.out.println("�ļ�:" + f.getName());
					}
				}
			}
		} else {
			System.out.println("�ļ������ڣ�");
		}
	}
}
