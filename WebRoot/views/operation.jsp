<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<base href="<%=basePath%>">
	<title>主页</title>
</head>

<body>

<center>
<h1>选择操作</h1>

<a href="<%=basePath%>views/contract.jsp">合同管理</a>
<a href="<%=basePath%>views/customer.jsp">客户管理</a>
<a href="<%=basePath%>views/product.jsp">产品管理</a>
<a href="<%=basePath%>views/staff.jsp">员工管理</a>


</center>
<a href="<%=basePath%>index.jsp">返回首页。。。</a>
</body>
</html>
