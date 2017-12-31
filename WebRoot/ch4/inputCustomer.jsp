<%@ page contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<title>输入用户信息</title>
	</head>
	<body>
		<h3>
			输入用户信息
		</h3>
		<form action="/MyWork/CustomerServlet.do" method="post">
			<table>
				<tr>
					<td>
						客户名：
					</td>
					<td>
						<input type="text" name="custName" />
					</td>
				</tr>
				<tr>
					<td>
						邮箱：
					</td>
					<td>
						<input type="text" name="email" />
					</td>
				</tr>
				<tr>
					<td>
						电话：
					</td>
					<td>
						<input type="text" name="phone" />
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="确定" />
					</td>
					<td>
						<input type="reset" value="重置" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
