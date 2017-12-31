<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<form action="LoginServlet" method="post" name="login">
	<p>
		用户名
		<input type="text" name="username" size="13" />
		密码
		<input type="password" name="password" size="13" />
		<input type="submit" name="Submit" value="登录" />
		<input type="button" name="register" value="注册" onclick="check();" />
		<input type="button" name="myorder" value="我的订单" />
		<input type="button" name="shopcart" value="查看购物车" />
</form>