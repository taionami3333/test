<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>total</title>
</head>
<body>
 <%@page errorPage="total-error.jsp" %>
 <%
 	request.setCharacterEncoding("UTF-8");
	int price = Integer.parseInt(request.getParameter("price"));
	int count = Integer.parseInt(request.getParameter("count"));
	int delivery = Integer.parseInt(request.getParameter("delivery"));
 %>
 合計<%= price*count+delivery %>円
</body>
</html>