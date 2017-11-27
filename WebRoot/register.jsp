<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/register.css" rel="stylesheet" type="text/css" >
  </head>
  
  <body>
  
   	<div class="boxs">
		<h1>用户注册</h1>		
		<div class="register-box">
			<form method="post" onsubmit="return check(this)">			
			姓名：<input type="text" name="name" size="15"><br/>
			年龄：<input type="text" name="age" size="5" ><br>
			性别：<input type="radio" name="sex" value="male"/>男
				  <input type="radio" name="sex" value="fmale"/>女<br>
			兴趣：<input type="checkbox" name="hobby" value="read"/>文学
				  <input type="checkbox" name="hobby" value="sport">体育
				  <input type="checkbox" name="hobby" value="computer"/>电脑<br>
			学历：<select name="education">
					<option value="bachelor">学士</option>
					<option value="master">硕士</option>
					<option value="doctor">博士</option>
				  </select><br/>
			邮件地址：<input type="text" name="email" size="20"/><br/>
				  <input type="submit" name="submit" value="提交"/>
				  <input type="reset" name="reset" value="重置"/>
			</form>
		</div>		
	</div>
	
	<script type="text/javascript" src="js/register.js" charset="utf-8"></script>
  </body>
</html>
