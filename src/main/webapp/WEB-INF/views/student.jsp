<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-3.3.7-dist/css/bootstrap.min.css" />">
		<script src="<c:url value="/resources/js/jquery-3.1.1.js" />"></script>
	</head>
	
	<body>
		<div class="jumbotron text-center">
			<h1>
				Student ${student.id}
			</h1>
		</div>
	</body>
</html>