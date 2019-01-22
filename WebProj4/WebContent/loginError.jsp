<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>LoginError</title>
</head>
<body>

<s:if test='(LoginDTOList.get(0).username)=="該当なし"'>
該当者がいませんでした
</s:if>

<br>
<table>
<tbody>
<tr>
<th>username</th>
<th>password</th>
</tr>
<tr>
<s:iterator value="loginDTOList">
<td><s:property value="username"/></td>
<td><s:property value="password"/></td>
</s:iterator>
</tr>
</tbody>
</table>
</body>
</html>