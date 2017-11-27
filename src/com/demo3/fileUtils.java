package com.demo3;

import java.io.File;

public class fileUtils {

	/**
	 * @param args
	 * 文件操作
	 * @author LSL
	 */
	public static void main(String[] args) {
		String path = "E:/";
		
//		String p = System.getProperty("user.dir");
//		System.out.println(p);
		traverseFolder(path);
	}
	
	// 遍历文件夹下的所有内容
	public static void traverseFolder(String path) {
		File file = new File(path);
		System.out.println(file);
		if (file.exists()) {
			File[] files = file.listFiles();
			if (file.length() == 0) {
				System.out.println("文件夹是空的！");
			} else {
				for (File f : files) {
					if (f.isDirectory()) {
						System.out.println("文件夹:" + f.getAbsolutePath());
						// 递归
						traverseFolder(f.getAbsolutePath());
					} else {
						System.out.println("文件:" + f.getName());
					}
				}
			}
		} else {
			System.out.println("文件不存在！");
		}
	}
}
