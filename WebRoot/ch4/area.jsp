<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>计算圆面积</title>

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
			String str = request.getParameter("radius");
			if (str == null)
				str = "0";
			r = Double.parseDouble(str);
		%>

		<form action="/MyWork/ch4/area.jsp" method="post">
			请输入圆的半径：
			<input type="text" name="radius" size="5" />
			<input type="submit" value="提交" />
		</form>
		半径为：<%=r%> 的圆的面积为:<%=area(r)%>

		<%!
			double r = 0;

			double area(double r) {
				return r * r * Math.PI;
		}%>
	</body>
</html>
