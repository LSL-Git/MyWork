<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>商城首页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/layout.css" rel="stylesheet" type="text/css" />

  </head>
  
  <body>
  	<div id="container">
  		<div id="header"><%@ include file="include/header.jsp" %></div>
  		<div id="topmenu"><%@ include file="include/topmenu.jsp" %></div>
  		<div id="middle">
  			<div id="leftmenu"><%@ include file="include/leftmenu.jsp" %></div>
  			<div id="content"><%@ include file="include/content.jsp" %></div>
  		</div>
  		<div id="footer"><%@ include file="include/footer.jsp" %></div>
  	</div>
  </body>
</html>
