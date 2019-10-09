<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'product.jsp' starting page</title>
    
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
     <form action="product" method="post">
     <div class="input">
			<input type="text"  name="product_name"/>
			<span class="fa fa-envelope"></span>
  </div>
  <p style="color:red">${msg}</p><br>
  <p style="color:red">${product_id}</p><br>
  <p style="color:red">${product_name}</p><br>
  <p style="color:red">${product_desc}</p><br>
     </form>
     <a href="<%=basePath%>views/operation.jsp">返回操作页。。。</a>
  </body>
</html>
