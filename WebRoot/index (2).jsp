﻿<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>派派电子商城</title>
<link href="css/layout.css" rel="stylesheet" type="text/css" />
</head>
<body>

	<div id="container">
		<div id="header">
			<img alt="Here id a logo." src="img/logo.jpg"/>
		</div>
		
		<div id="topmenu">
			<form action="LoginServlet" method="post" name="login">
				<p>用户名<input type="text" name="username" size="13"/>
					密码	 <input type="password" name="password" size="13"/>
					<input type="submit" name="Submit" value="登录"/>
					<input type="button" name="register" value="注册" onclick="check();"/>
					<input type="button" name="myorder" value="我的订单"/>
					<input type="button" name="shopcart" value="查看购物车"/>
			</form>
		</div>
		
		<div id="middle">
			<div id="leftmenu">
				<p align="center"><b>商品分类</b></p>
				<ul>
					<li><a href="goods.do?catalog = mobilephone">手机数码</a></li>
					<li><a href="goods.do?catalog = eleccc">家用电器</a></li>
					<li><a href="goods.do?catalog = mobilephone">汽车用品</a></li>
					<li><a href="goods.do?catalog = mobilephone">服饰鞋帽</a></li>
					<li><a href="goods.do?catalog = mobilephone">运动健康</a></li>
				</ul>
			</div>
			
			<div id="content">
				<table>
					<tr>
						<td><img src="img/phone.jpg"/></td><td><p>
						三星 S580 领取手机节优惠劵，立减100元！再送：200元移动手机卡！
						派派价：2068元</p></td>
						
						<td><img src="img/comp.jpg"/></td>
						<td><p>
						联想（Lenovo)G460AL-IT H14.0 英寸笔记本电脑(i3 - 370M 2 G 500G 512 独显 DVD 刻录 摄像头 Win7)  特价：3199元！</p></td>
					</tr>
				</table>
			</div>
		</div>
		
		<div id="footer">
			<hr size="1" color="blue"/>
			Copyright &copy; 2017/9/20 LSL Web Design
		</div>
	</div>

</body>
</html>