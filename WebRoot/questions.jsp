<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>简单考试系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		#content {
			width: 70%;
			margin:0 auto;
			background: #fff;
			box-shadow: 3px 3px 5px #888888;
		}
		#content h4 {
			padding:20px;
		}
		
		#content form {
			padding-left: 20px;
			padding-right: 20px;
		}
		
		body {
			background: #ccc;
			margin:0;
			padding:0;
		}
		
		#content form #but {
			margin-top: 20px;
			padding-bottom: 20px;
		}
	</style>

  </head>
  
  <body>
  	<div id="content">
	    <h4>请回答下面问题</h4>
	    <form action="SimpleTestServlet.do" method="post">
	    	<p>1.Sun公式于2010年被Oracle公司收购。</p>
	    	<input type="radio" name="quest1" value="1"/>正确
	    	<input type="radio" name="quest1" value="2"/>错误<br/>
	    	<p>2.Windows 操作系统是哪个公司的产品？</p>
	    	<input type="radio" name="quest2" value="1"/>Apple公司
	    	<input type="radio" name="quest2" value="2"/>IBM公司
	    	<input type="radio" name="quest2" value="3"/>Microsoft公司<br/>
	    	<p>3.下面程序设计语言，哪个是面向对象的？</p>
	    	<input type="checkbox" name="quest3" value="1"/>Java 语言
	    	<input type="checkbox" name="quest3" value="2"/>C 语言
	    	<input type="checkbox" name="quest3" value="3"/>C++ 语言<br/>
	    	<p>4.编写 Servlet 程序应继承那个类？</p>
	    	<input type="text" name="quest4" size="30"/><br/>
	    	<hr />
	    	<div id="but">
		    	交卷请点击:<input type="submit" value="交卷"/>
		    	重答请点击:<input type="reset" value="重答"/>
	    	</div>
	    </form>  	
  	</div>
  </body>
</html>
