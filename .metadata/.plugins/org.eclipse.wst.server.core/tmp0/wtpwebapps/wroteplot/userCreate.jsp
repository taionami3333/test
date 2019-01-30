<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<link rel="stylesheet" type="text/css" href="./css/style.css" >
<link href="https://fonts.googleapis.com/css?family=Montserrat|Roboto:300" rel="stylesheet">
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="">
<meta name="keywords" content=""/>
<title>Home画面</title>
</head>
<body>
<header>
    <div id="logo">
        <h1>WROTE</h1>
    </div>
    <div id="headerNav">
        <ul>
            <li>about</li>
            <li>shopping</li>
            <li>my cart</li>
            <li>contact</li>
        </ul>

    </div>
</header>
<div id="main">
    <div id="left">
        <div id="topImg">
            <img src="./img/aroma-aromatherapy-aromatic-1619488.jpg"  width="80%">
        </div>
    </div>
    <div id="right">
    	<div id="formhead">
    		 <h2 id="title">Write your personal details</h2>

    	</div>

        <div id="form">
        <s:form action="UserCreateConfirmAction">
			<s:textfield name="userName" placeholder="Your Name"/>
			<s:password name="loginUserId" placeholder="User ID"/>
			<s:password name="loginPassword" placeholder="Password"/>
			<s:submit id="submit" value="Create Acount"/>
		</s:form>
		</div>

    </div>
    <div id="section">
        <h2>
        The spectacle before us was indeed sublime.
        </h2>
        <p>Apparently we had reached a great height in the atmosphere, for the sky was a dead black, and the stars had ceased to twinkle. By the same illusion which lifts the horizon of the sea to the level of the spectator on a hillside, the sable cloud beneath was dished out, and the car seemed to float in the middle of an immense dark sphere, whose upper half was strewn with silver. Looking down into the dark gulf below, I could see a ruddy light streaming through a rift in the clouds.</p>
    </div>
</div>
<footer>

</footer>
</body>
</html>