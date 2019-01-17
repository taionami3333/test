<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page isErrorPage="true" %>
<p>solution error</p>
<button onclick="history.back()">back</button>
<br>
<p><%= exception %></p>
<table border=1>
<tr>
	<td>raw error msg</td>
	<td><%= exception.getMessage() %></td>
</tr>
<tr>
	<td>raw errormsg => model to String</td>
	<td><%= exception.toString() %></td>
</tr>
<tr>
	<td>stacktrace</td>
	<td>
		<%
		 exception.printStackTrace(new java.io.PrintWriter(out));
		%>
	</td>
</tr>
</table>
</body>
</html>