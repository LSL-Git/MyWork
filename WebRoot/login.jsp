<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<style type="text/css">
		table {
			position:absolute;
			top: 38%;
			left: 41%;
			background: rgba(0,0,0,0.4);
			padding:30px;
			color: #fff;
		}
		
		.t {
			font-family: '微软雅黑';
			font-size: 2em;
			padding-bottom: 10px;
			margin-top: -10px;
			color: #fff;
		}
		
		body {
			background: url('img/bg.jpg');	
			background-size: cover;
		}
	</style>

  </head>
  
  <body>
	<form method="post"	action="login.do">
		
		<table>
			<tr>
				<td class="t" colspan="2">用户登录</td>
			</tr>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="uname"/></td>
			</tr>
			<tr>
				<td>密&nbsp;&nbsp;码：</td>
				<td><input type="password" name="upsw"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="checkbox" value="check" name="check" checked="checked"/>记住密码
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="登录"/></td>
				<td><input type="reset" value="取消"/></td>
			</tr>
		</table>
	</form>
  </body>
</html>
