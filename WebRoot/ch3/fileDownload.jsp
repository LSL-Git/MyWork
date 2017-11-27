<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>文件下载</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="#C0DFFD">
    <table border="1" align="center">
	    <tr><td colspan="3" align="center" class="pageName" height="40">文件下载</td></tr>
	    <tr><td height="36">资源</td><td>描述</td><td>下载</td></tr>
	    <tr><td height="36">commons-io-2.5</td><td>负责输入输出的软件包</td>
	    <td><a href="/MyWork/FileDownloadServlet.do?filename=commons-io-2.5.jar">下载</a></td></tr>
	    <tr><td height="36">commons-fileupload-1.3.2</td><td>文件上传软件包，需要commons-io软件包的支持。</td>
	    <td><a href="/MyWork/FileDownloadServlet.do?filename=commons-fileupload-1.3.2.jar">下载</a></td></tr>
	    <tr><td height="36">mysqldriver</td><td>mysql驱动</td>
	    <td><a href="/MyWork/FileDownloadServlet.do?filename=mysqldriver.jar">下载</a></td></tr>
	    <tr><td height="36" width="200">&nbsp;</td>
		    <td width="300">相关资源来自<a href="http://www.apache.org">www.apache.org</a></td>
		    <td width="60">&nbsp;</td>
		</tr>
    </table>
  </body>

</html>
