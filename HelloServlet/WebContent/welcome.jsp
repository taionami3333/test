<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome</title>
</head>
<body>
<p>名前とパスワードを入力してください </p>
<form method="post" action="WelcomeServlet">
<input type="text" name="username">
<input type="password" name="password">
<input type="submit" value="send">
</form>
</body>
</html>