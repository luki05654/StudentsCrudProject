<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>
			<spring:message code="student.page.title"/>
		</title>
		
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-3.3.7-dist/css/bootstrap.min.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/myStyles.css" />">
		
		<script src="<c:url value="/resources/js/jquery-3.1.1.js" />"></script>
	</head>
	
	<body>
		<div class="jumbotron text-center">
			<h1>
				<spring:message code="student.page.header"/>
			</h1>
		</div>
		<div class="page-header text-center">
			<h1>
				${student.personalData.firstName}&nbsp;${student.personalData.lastName}
			</h1>
		</div>	
		<div class="container">
			<div class="row">
				<div class="col-md-5">
					<p>
						<strong>
							<spring:message code="student.page.description.first.name"/>:
						</strong>
						<span>${student.personalData.firstName}</span>
					</p>
					<p>
						<strong>
							<spring:message code="student.page.description.last.name"/>:
						</strong>
						<span>${student.personalData.lastName}</span>
					</p>
					<p>
						<strong>
							<spring:message code="student.page.description.sex"/>:
						</strong>
						<span>${student.personalData.sex}</span>
					</p>
					<p>
						<strong>
							<spring:message code="student.page.description.city"/>:
						</strong>
						<span>${student.homeLocality.city}</span>
					</p>
					<p>
						<strong>
							<spring:message code="student.page.description.street"/>:
						</strong>
						<span>${student.homeLocality.street}</span>
					</p>
					<p>
						<strong>
							<spring:message code="student.page.description.building.number"/>:
						</strong>
						<span>${student.homeLocality.buildingNumber}</span>
					</p>
					<p>
						<strong>
							<spring:message code="student.page.description.postal.code"/>:
						</strong>
						<span>${student.homeLocality.postalCode}</span>
					</p>
					<p>
						<strong>
							<spring:message code="student.page.description.post.office.location"/>:
						</strong>
						<span>${student.homeLocality.postOfficeLocation}</span>
					</p>
					<p>
						<strong>
							<spring:message code="student.page.description.phone.number"/>:
						</strong>
						<span>${student.contactDetails.phoneNumber}</span>
					</p>
					<p>
						<strong>
							<spring:message code="student.page.description.email.address"/>:
						</strong>
						<span>${student.contactDetails.emailAddress}</span>
					</p>
					<p>
						<strong>
							<spring:message code="student.page.description.departments"/>:
						</strong>
						<c:forEach items="${student.departments}" var="department">
							<span>${department.departmentName}</span>
						</c:forEach>
					</p>					
				</div>
			</div>
		</div>
	</body>
</html>