<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>
			<spring:message code="students.admin.add.student.page.title"/>
		</title>
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-3.3.7-dist/css/bootstrap.min.css" />">
		<link rel="stylesheet" href="<c:url value="/resources/css/myStyles.css" />">
		
		<script src="<c:url value="/resources/js/jquery-3.1.1.js" />"></script>
		<script src="<c:url value="/resources/js/ajaxPaginator.js" />"></script>		
	</head>
	<body>	
		<div class="jumbotron text-center">
			<h1>
				<spring:message code="students.admin.add.student.page.title"/>
			</h1>
		</div>
		<div class="container">
			<form:form modelAttribute="newStudent" class="form-horizontal">
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<p class="text-left">
							<spring:message code="students.admin.add.student.paragraph"/>
						</p>
					</div>
				</div>				
				<div class="form-group">
					<label class="control-label col-lg-2" for="firstName">
						<spring:message code="students.admin.add.student.firstName"/>
					</label>
					<div class="col-lg-10">
						<form:input id="firstName" path="personalData.firstName"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="lastName">
						<spring:message code="students.admin.add.student.lastName"/>
					</label>
					<div class="col-lg-10">
						<form:input id="lastName" path="personalData.lastName"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="sex">
						<spring:message code="students.admin.add.student.sex"/>
					</label>
					<div class="col-lg-10">
						<form:select id="sex" path="personalData.sex">
							<form:options items="${sexs}"/>
						</form:select>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="phoneNumber">
						<spring:message code="students.admin.add.student.phoneNumber"/>
					</label>
					<div class="col-lg-10">
						<form:input id="phoneNumber" path="contactDetails.phoneNumber"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="emailAddress">
						<spring:message code="students.admin.add.student.emailAddress"/>
					</label>
					<div class="col-lg-10">
						<form:input id="emailAddress" path="contactDetails.emailAddress"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="city">
						<spring:message code="students.admin.add.student.city"/>
					</label>
					<div class="col-lg-10">
						<form:input id="city" path="homeLocality.city"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="street">
						<spring:message code="students.admin.add.student.street"/>
					</label>
					<div class="col-lg-10">
						<form:input id="street" path="homeLocality.street"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="buildingNumber">
						<spring:message code="students.admin.add.student.buildingNumber"/>
					</label>
					<div class="col-lg-10">
						<form:input id="buildingNumber" path="homeLocality.buildingNumber"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="postalCode">
						<spring:message code="students.admin.add.student.postalCode"/>
					</label>
					<div class="col-lg-10">
						<form:input id="postalCode" path="homeLocality.postalCode"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="postOfficeLocation">
						<spring:message code="students.admin.add.student.postOfficeLocation"/>
					</label>
					<div class="col-lg-10">
						<form:input id="postOfficeLocation" path="homeLocality.postOfficeLocation"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="postOfficeLocation">
						<spring:message code="students.admin.add.student.postOfficeLocation"/>
					</label>
					<div class="col-lg-10">
						<form:select multiple="true" path="departments">
							<form:options items="${departments}"/>
						</form:select>
					</div>
				</div>
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<button type="submit" class="btn btn-success">
							<spring:message code="students.admin.add.student.submit"/>
						</button>
					</div>
				</div>
			</form:form>
		</div>
	</body>
</html>