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
    
    <title>error</title>
    

  </head>
  
  <body>
     <center>
     <p style="color:red">${msg}</p><hr>
     <a href="<%=basePath%>views/operation.jsp">返回操作页。。。</a>
     </center>
  </body>
</html>
