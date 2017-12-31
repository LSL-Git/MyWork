<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<%@ page contentType="text/html;charset=utf-8" %>
<%@ page info="这是一个简单的页面。" %>
<!--指定错误跳转页面-->
<%@ page errorPage="/message.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>当前日期</title>
    
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
	<% 
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.FULL); 
		String s = dateformat.format(new Date());  
	 %>
	 
	今天的日期是：<%=s %><br/>
	info: <%=getServletInfo() %>
  </body>
</html>
