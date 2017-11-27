<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>我的Java Web工程</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<style>
		body {
			background: url('img/bg.jpg');	
			background-size: cover;
			padding: 0;
			margin: 0;
		}
		a {
			color: #4b4f5b;
			text-decoration: none;
		}
		
		a:hover {
			color: #f2671b;
		}
		
		table {
			background: #fff;
			width: 80%;
			margin: 0 auto;
			box-shadow: 2px 2px 5px #000;
			padding-bottom: 20px;
		}
		.p {
			padding-left: 20px;
		}
	</style>
  </head>
  
  <body>
    <!-- 使用<table>标签进行页面布局 -->
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
  		<tr bgcolor="#3366CC">
    		<td width="382" ><img src="img/header.jpg" alt="Header image" border="0" /></td>
    		<td width="382" align="center"><h1>JavaWeb实验</h1>
    		<h3>玉师计工学院软工2015级</h3></td>
   			<td width="*">&nbsp;</td>
  		</tr>

  		<tr>
    		<td colspan="3" bgcolor="#003366">
    		<img src="img/spacer.gif" alt="" width="1" height="1" border="0" /></td>
  		</tr>

  		<tr bgcolor="#CCFF99">
    		<td  class="p"><a href="login.jsp">登 录</a>
			&nbsp;&nbsp;<a href="register.jsp">注 册</a></td>
			<td align="left">网站作者：瞌睡虫 &nbsp; 指导老师：刘忠平</td>
  			<td> &nbsp;</td>
  		</tr>
 		<tr>
    		<td colspan="3" bgcolor="#003366">
    		<img src="img/spacer.gif" alt="" width="1" height="1" border="0" /></td>
    	</tr>
    	<tr><td colspan="3" height="16">&nbsp;</td></tr>
  		<tr>
  			<td class="p">第一章：Java Web技术概述</td>
  			<td>
	  			<a href="register.jsp">程序1.1 register.jsp</a><br>
	  			<a href="index.html">程序1.2 index.html</a><br>
	  			<a href="inputCheck.html">程序1.4 inputCheck.html</a>
  			</td>
  			<td>&nbsp;</td>
  		</tr> 
  		<tr><td colspan="3" height="16">&nbsp;</td></tr>
  		<tr>
  			<td class="p">第二章：Servlet技术模型</td>
  			<td>
	  			<a href="login.jsp">程序2.1 login.jsp</a><br/>
	  			<a href="/MyWork/ClientInfoServlet.do">检索客户端信息</a><br/>
	  			<a href="/MyWork/ShowHeaderServlet.do">查看 HTTP 头信息</a><br/>
	  			<a href="questions.jsp">简单的考试系统</a><br/>
	  			<a href="FileUpload.jsp">文件上传</a><br/>
	  			<a href="/MyWork/ExcelServlet.do">导出Excel表格</a><br>
	  			<a href="/MyWork/ShowTimeServlet.do">定时刷新页面</a>
  			</td>
  		</tr>
  		<tr><td colspan="3" height="16">&nbsp;</td></tr>
  		<tr>
  			<td class="p">第三章：Servlet 容器模型</td>
  			<td>
  				<a href="ch3/fileDownload.jsp">文件下载</a><br/>
  				<a href="ShowSessionServlet.do">会话跟踪示例</a><br>
  				<a href="GuessNumberServlet.do">猜数字游戏</a><br>
  				<a href="ch3/Login.jsp">用户登录</a><br/>
  			</td>
  		</tr>
  	</table>
  	
  	
  </body>
</html>
