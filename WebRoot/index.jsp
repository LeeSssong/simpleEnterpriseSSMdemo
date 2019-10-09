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
    
    <meta http-equiv ="Content-Type" content="text/html; charset=UTF-8">
    
    <title>登陆界面</title>
    
  </head>
  
  <body>
  <center>
  	<p style="color:red">${msg}</p><hr>
  	<form action="login" method="post">
  	<table align="center" width="450">
    	<tr>
    		<td align="center" colspan="2">
    			<h2>登陆</h2>
    			<hr>
    		</td>
    	</tr>
    	
    	<tr>
    		<td align="right">名称：</td>
    		<td><input type="text" name="manager_name"></td>
    	</tr>
    	
    	<tr>
    		<td align="right">密码：</td>
    		<td><input type="password" name="manager_password"></td>
    	</tr>
    	
    	<tr>
    		<td align="center" colspan="2">
    		<input type="submit" value="登陆"/>
    		<input type="reset" value="重置"/>
    		<br>
    		<a href="<%=basePath%>views/register.jsp">注册用户</a>
    </table>
  	</form><hr>
  	</center>
  </body>
</html>