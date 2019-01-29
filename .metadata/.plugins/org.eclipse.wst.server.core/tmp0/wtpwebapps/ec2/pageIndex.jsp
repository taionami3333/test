<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="">
<meta name="keywords" content=""/>
<title>Home画面</title>
<style type="text/css">
	/*---Tag Layout---*/
	body{
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana, Helvetica, sans-serif;
	font-size:12px;
	color:#333;
	background:#fff;
	}
</style>
</head>
<body>
<table>
<tbody>
<tr>
<th style="text-align:left;">商品名</th>
<th>ブランド</th>
<th>価格</th>
</tr>
<s:iterator value="#session.pageDTOList">
<tr>
<td>
<a href='
<s:url action="pageDetailAction">
<s:param name="itemName" value="%{itemName}" />
</s:url>'><s:property value="itemName"/></a>
</td>
<td><s:property value="itemBrand"/></td>
<td><s:property value="itemPrice"/></td>
</tr>
</s:iterator>
</tbody>
</table>

</body>
</html>