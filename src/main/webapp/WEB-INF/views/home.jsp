<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-3.3.7-dist/css/bootstrap.min.css" />">
<script src="<c:url value="/resources/js/jquery-3.1.1.js" />"></script>
</head>
<body>
	<div class="jumbotron">
		<h1>Hello world!</h1>
	</div>

	<p>The time on the server is ${serverTime}.</p>
</body>
</html>
