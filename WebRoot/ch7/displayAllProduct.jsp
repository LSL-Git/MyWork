<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ page import="java.util.*,com.demo7.Product"%>

<html>
	<head>
		<title>商品信息</title>
	</head>
	<body>
		<table border="1">
			<tr>
				<td>
					商品号
				</td>
				<td>
					商品名
				</td>
				<td>
					价&nbsp;格
				</td>
				<td>
					库存量
				</td>
			</tr>
			<%
				ArrayList<Product> productList = (ArrayList<Product>) session
						.getAttribute("productList");
				for (Product product : productList) {
			%>
			<tr>
				<td><%=product.getProd_id()%></td>
				<td><%=product.getPname()%></td>
				<td><%=product.getPrice()%></td>
				<td><%=product.getStock()%></td>
			</tr>
			<%
				}
			%>
		</table>
	</body>
</html>
