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
    <title>注册界面</title>
    

  </head>
  
  <body>
 
 <center>
  <p style="color:red">${msg}</p><hr>
  <h1>用户注册</h1>
  <hr/>
  <form action="register" method="post">
   <table border="0" >
     <tr>
       <td align="right">用户名:</td>
       <td><input type="text" name="manager_name" style="width: 180px"/></td>
     </tr>
     <tr>
        <td align="right">密    码:</td>
        <td><input type="password" name="manager_password" style="width: 180px"/></td>
     </tr>
     <tr>
     	<td align="center" colspan="2">
        <input type="submit" value="提交注册"/>
        <input type="reset" value="重置"/>
        <br>
     </tr>
    
   </table>
  </form><hr>
  <a href="<%=basePath%>views/operation.jsp">返回操作页。。。</a>
 </center>
	
</body>
</html>
