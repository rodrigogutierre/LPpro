<%-- 
    Document   : Login
    Created on : 03/07/2017, 01:11:03 AM
    Author     : rodrigo gutierrez
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Login</title>
        <link rel="stylesheet" href="<c:url value="recursos/css/normalize.css"/>" type="text/css"/>
	<link rel="stylesheet" href="<c:url value="recursos/css/sweetalert2.css">"type="text/css"/>
	<link rel="stylesheet" href="<c:url value="recursos/css/material.min.css">"type="text/css"/>
	<link rel="stylesheet" href="<c:url value="recursos/css/material-design-iconic-font.min.css">"type="text/css"/>
	<link rel="stylesheet" href="<c:url value="recursos/css/jquery.mCustomScrollbar.css">"type="text/css"/>
	<link rel="stylesheet" href="<c:url value="recursos/css/main.css">"type="text/css"/>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="js/jquery-1.11.2.min.js"><\/script>')</script>
	<script src="recursos/js/material.min.js" ></script>
	<script src="recursos/js/sweetalert2.min.js" ></script>
	<script src="recursos/js/jquery.mCustomScrollbar.concat.min.js" ></script>
	<script src="recursos/js/main.js" ></script>
        <script src='https://cdnjs.cloudflare.com/ajax/libs/stats.js/r16/Stats.min.js'></script>
        <script src='https://cdnjs.cloudflare.com/ajax/libs/pixi.js/4.3.5/pixi.min.js'></script>
        <script src="js/index.js"></script>


        <title>login</title>
        
        
        
    </head>
    
<body>
	<div class="container-login">
		<p class="text-center" style="font-size: 80px;">
			<i class="zmdi zmdi-account-circle"></i>
		</p>
		<p class="text-center text-condensedLight">Ingresar</p>
		<form>
			<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
			    <input class="mdl-textfield__input" type="text" id="userName">
			    <label class="mdl-textfield__label" for="userName">User Name</label>
			</div>
			<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
			    <input class="mdl-textfield__input" type="password" id="pass">
			    <label class="mdl-textfield__label" for="pass">Password</label>
			</div>
			<button id="SingIn" class="mdl-button mdl-js-button mdl-js-ripple-effect" style="color: #3F51B5; float:right;">
				Sign in <i class="zmdi zmdi-mail-send"></i>
			</button>
		</form>
	</div>
</body>
</html>





