<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
	<head>
		<title>商品查询</title>	
	</head>
	
	<body>
		<form action="/MyWork/QueryProductServlet.do" method="post">
			请输入商品号：
			<input type="text" name="productId" size="20"/>
			<input type="submit" value="确定"/>
		</form>
		
		<p><a href="/MyWork/QueryProductServlet.do">查询所有商品</a></p>
	</body>
</html>
