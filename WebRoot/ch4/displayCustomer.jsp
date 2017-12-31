<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<jsp:useBean id="customer" class="com.demo4.Custome" scope="session">
	<!-- 获取Custome Beans的所有属性值 -->
	<jsp:setProperty name="customer" property="*" />
</jsp:useBean>

<html>
	<head>
		<title>显示客户信息</title>
	</head>
	<h3>
		客户信息如下：
	</h3>
	<table border="1">
		<tr>
			<td>
				客户名：
			</td>
			<td>
				<!--获取customer中的custName属性值 下同-->
				<jsp:getProperty property="custName" name="customer"/>
			</td>
		</tr>
		<tr>
			<td>
				邮箱：
			</td>
			<td>
				<jsp:getProperty property="email" name="customer"/>
			</td>
		</tr>
		<tr>
			<td>
				电话：
			</td>
			<td>
				<jsp:getProperty property="phone" name="customer"/>
			</td>
		</tr>
	</table>
</html>