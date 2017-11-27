<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>文件上传结果</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 设置5秒后跳转回主页
	<meta http-equiv="Refresh" content="5;URL=/MyWork/">-->
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<script type="text/javascript">
		var i = 5;
		// 倒计时
		function init()
		{
			var h = document.getElementById("t");
			h.innerHTML = i + "秒后跳转回主页...";
			i--;
			var x = setTimeout('init()',1000);
			if (i <= -1) {
				clearTimeout(x);
			}
		}
		window.onload = init;
	</script>

  </head>
  
  <body>
    ${message} <br>
    <h3 id="t"></h3>
    <a href="/MyWork/">主页</a>
  </body>
</html>
