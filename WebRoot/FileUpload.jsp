<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>上传文件</title>
    
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body> 
    <br>${message}<br/>
    <form action="FileUploadServlet.do" method="post" enctype="multipart/form-data">
    	<table>
    		<tr>
    			<td colspan="2" align="center">文件长传</td>
    		</tr>
    		<tr>
    			<td>会员号：</td>
    			<td><input type="text" name="mnumber" size="30"/></td>
    		</tr>
    		<tr>
    			<td>文件名：</td>
    			<td><input type="file" name="fileName" size="30"/></td>
    		</tr>
    		<tr>
    			<td align="right"><input type="submit" value="提交"/></td>
    			<td align="left"><input type="reset" value="重置"/></td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
