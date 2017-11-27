<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户登录页面</title>
    
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
    	登录信息:${sessionScope.message }<br/>
	    <form action="CheckUserServlet.do" method="post">
	    	请输入用户名和口令：<br/>
	    	用户名：<input type="text" name="username"/><br/>
	    	口&nbsp;令:<input type="password" name="password"/><br>
	    	<input type="checkbox" name="check" value="check"/>自动登录<br>
	    	<input type="submit" value="提交" />
	    	<input type="reset" value="重置" />
	    </form>
  </body>
</html>
