<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>
			<spring:message code="home.page.title"/>
		</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-3.3.7-dist/css/bootstrap.min.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/menu.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/backgrounds.css" />">
		<script src="<c:url value="/resources/js/jquery-3.1.1.js" />"></script>
	</head>
	<body class="primary-background">
		<div class="jumbotron text-center">
			<h1>
				<spring:message code="home.page.header"/>			
			</h1>
		</div>
		
		<div class="container text-center my-container">
			<button type="button" class="btn btn-lg btn-info btn-block">
				<spring:message code="home.page.button.admin.text"/>
			</button>
		</div>
		
		<div class="container text-center my-container" id="container-user">
			<button type="button" class="btn btn-lg btn-success btn-block" >
				<spring:message code="home.page.button.user.text"/>
			</button>
		</div>
	</body>
</html>
