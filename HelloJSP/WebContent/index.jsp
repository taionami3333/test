<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<body>
<p>こんにちは</p>
<% out.println(new java.util.Date()); %>

<p>お名前を入力してください</p>
<form method="post" action="greeting-out.jsp">
<input type="text" name="user">
<input type="submit" value="確定">
</form>
<br>
<form method="post" action="total-out.jsp">
<input type="text" name="price">円<br>
<input type="text" name="count">個<br>
<input type="text" name="delivery">送料<br>
<input type="submit" value="計算">
</form>

</body>
</html>