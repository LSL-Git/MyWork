<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.net.*"%>
<%!String cookieValue = "";%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	// 获取cookie
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (int i = 0; i < cookies.length; i++) {
			Cookie cookie = cookies[i];
			// 遍历cookie值,获取期望值
			if (cookie.getName().equals("username")) {
				cookieValue = URLDecoder.decode(cookie.getValue(),
						"utf-8");// 读取并解码
			}
		}
	}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>我的Java Web工程</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/index.css">

	</head>

	<body>
		<!-- 使用<table>标签进行页面布局 -->
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr bgcolor="#3366CC">
				<td width="382">
					<img src="img/header.jpg" alt="Header image" border="0" />
				</td>
				<td width="382" align="center">
					<h1>
						JavaWeb实验
					</h1>
					<h3>
						玉师计工学院软工2015级
					</h3>
				</td>
				<td width="*">
					&nbsp;
				</td>
			</tr>

			<tr>
				<td colspan="3" bgcolor="#003366">
					<img src="img/spacer.gif" alt="" width="1" height="1" border="0" />
				</td>
			</tr>

			<tr bgcolor="#CCFF99">
				<td class="p">
					<a href="login.jsp">登 录</a> &nbsp;&nbsp;
					<a href="register.jsp">注 册</a>
				</td>
				<td align="left">
					网站作者：<%=cookieValue%>
					&nbsp; 指导老师：刘忠平
				</td>
				<td>
					&nbsp;
				</td>
			</tr>
			<tr>
				<td colspan="3" bgcolor="#003366">
					<img src="img/spacer.gif" alt="" width="1" height="1" border="0" />
				</td>
			</tr>
			<tr>
				<td colspan="3" height="16">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td class="p">
					第一章：Java Web技术概述
				</td>
				<td>
					<a href="register.jsp" onclick="return isLogin('<%=cookieValue%>')">程序1.1
						register.jsp</a>
					<br>
					<a href="index (2).jsp" onclick="return isLogin('<%=cookieValue%>')">程序1.2
						index.html</a>
					<br>
					<a href="inputCheck.jsp"
						onclick="return isLogin('<%=cookieValue%>')">程序1.4
						inputCheck.html</a>
				</td>
				<td>
					&nbsp;
				</td>
			</tr>
			<tr>
				<td colspan="3" height="16">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td class="p">
					第二章：Servlet技术模型
				</td>
				<td>
					<a href="login.jsp" onclick="return isLogin('<%=cookieValue%>')">程序2.1
						login.jsp</a>
					<br />
					<a href="/MyWork/ClientInfoServlet.do"
						onclick="return isLogin('<%=cookieValue%>')">检索客户端信息</a>
					<br />
					<a href="/MyWork/ShowHeaderServlet.do"
						onclick="return isLogin('<%=cookieValue%>')">查看 HTTP 头信息</a>
					<br />
					<a href="questions.jsp"
						onclick="return isLogin('<%=cookieValue%>')">简单的考试系统</a>
					<br />
					<a href="FileUpload.jsp"
						onclick="return isLogin('<%=cookieValue%>')">文件上传</a>
					<br />
					<a href="/MyWork/ExcelServlet.do"
						onclick="return isLogin('<%=cookieValue%>')">导出Excel表格</a>
					<br>
					<a href="/MyWork/ShowTimeServlet.do"
						onclick="return isLogin('<%=cookieValue%>')">定时刷新页面</a>
				</td>
			</tr>
			<tr>
				<td colspan="3" height="16">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td class="p">
					第三章：Servlet 容器模型
				</td>
				<td>
					<a href="ch3/fileDownload.jsp"
						onclick="return isLogin('<%=cookieValue%>')">文件下载</a>
					<br />
					<a href="ShowSessionServlet.do"
						onclick="return isLogin('<%=cookieValue%>')">会话跟踪示例</a>
					<br>
					<a href="GuessNumberServlet.do"
						onclick="return isLogin('<%=cookieValue%>')">猜数字游戏</a>
					<br>
					<a href="ch3/Login.jsp"
						onclick="return isLogin('<%=cookieValue%>')">用户登录</a>
					<br />
				</td>
			</tr>

			<tr>
				<td colspan="3" height="16">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td class="p">
					第四章：JSP 技术模型
				</td>
				<td>
					<a href="ch4/todayDate.jsp"
						onclick="return isLogin('<%=cookieValue%>')">当前日期</a>
					<br />
					<a href="ch4/area.jsp"
						onclick="return isLogin('<%=cookieValue%>')">计算圆面积</a>
					<br />
					<a href="ch4/initTest.jsp"
						onclick="return isLogin('<%=cookieValue%>')">初始化参数</a>
					<br />
					<a href="ch4/index.jsp"
						onclick="return isLogin('<%=cookieValue%>')">include使用</a>
					<br />
					<a href="ch4/inputCustomer.jsp"
						onclick="return isLogin('<%=cookieValue%>')">javaBeans使用</a>
					<br />
				</td>
			</tr>
			<tr>
				<td colspan="3" height="16">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td class="p">
					第七章：JDBC 数据库访问
				</td>
				<td>
					<a href="ch7/queryProduct.jsp"
						onclick="return isLogin('<%=cookieValue%>')">商品查询</a>
					<br />
					<a href="ch4/area.jsp"
						onclick="return isLogin('<%=cookieValue%>')">计算圆面积</a>
					<br />
					<a href="ch4/initTest.jsp"
						onclick="return isLogin('<%=cookieValue%>')">初始化参数</a>
					<br />
					<a href="ch4/index.jsp"
						onclick="return isLogin('<%=cookieValue%>')">include使用</a>
					<br />
					<a href="ch4/inputCustomer.jsp"
						onclick="return isLogin('<%=cookieValue%>')">javaBeans使用</a>
					<br />
				</td>
			</tr>
		</table>

		<script type="text/javascript">			
			// 检验机制有点low
			function isLogin(val) {
				if (val == '瞌睡虫') {
					return true;
				} else {
					alert("请先登录!");
					return false;
				}
			}
		</script>

	</body>
</html>
