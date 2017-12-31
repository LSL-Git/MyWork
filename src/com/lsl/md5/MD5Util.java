package com.lsl.md5;

import java.security.MessageDigest;;

public class MD5Util {
	
	/**
	 * ���ַ���ʹ��md5����Ϊ�ֽ�����
	 * @param source
	 * @return
	 */
	public static byte[] encode2byte(String source) {
		byte[] result = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.reset();
			md.update(source.getBytes("utf-8"));
			result = md.digest();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * ��Դ�ַ���ʹ��md5����Ϊ32λ��16������
	 * @param source
	 * @return
	 */
	public static String encode2hex(String source) {
		byte[] data = encode2byte(source);
		
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			String hex = Integer.toHexString(0xff & data[i]);
			
			if (hex.length() == 1) {
				hexString.append("0");
			}
			
			hexString.append(hex);
		}
		
		return hexString.toString();
	}
	
	/**
	 * ��֤�ַ����Ƿ�ƥ��
	 * @param unknow ����֤�ַ���
	 * @param okHex ʹ��md5���ܺ��16�����ַ���
	 * @return
	 */
	public static boolean validate(String unknow, String okHex) {
		return okHex.equals(encode2hex(unknow));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "������";
		String str = MD5Util.encode2hex(s);
		System.out.println("���ܺ�" + str);
		System.out.println("�Ƿ�ƥ��ԭ�ַ����� " + MD5Util.validate(s, str));
	}

}
