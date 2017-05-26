<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="students.admin.page.title" /></title>
<link rel="stylesheet"
	href="<c:url value="/resources/css/bootstrap-3.3.7-dist/css/bootstrap.min.css" />">
<link rel="stylesheet"
	href="<c:url value="/resources/css/myStyles.css" />">

<script src="<c:url value="/resources/js/jquery-3.1.1.js" />"></script>
<script src="<c:url value="/resources/js/ajaxPaginator.js" />"></script>
</head>
<body>
	<div class="jumbotron text-center">
		<h1>
			<spring:message code="students.user.page.title" />
		</h1>
	</div>
	<div class="page-header text-center">
		<h1>
			<spring:message code="stusents.page.table.description" />
		</h1>
	</div>
	<div class="container">
		<div id="table-operations" class="row">
			<div class="col-sm-6 text-left my-col-operations">
				<input type="text" id="input-search"> <a
					class="btn btn-success" id="link-search"> <spring:message
						code="students.table.search" />
				</a>
			</div>
			<div class="col-sm-6 text-right my-col-operations">
				<button class="btn btn-warning btn-first-page">
					<spring:message code="students.table.button.firstPage" />
				</button>
				<button class="btn btn-primary btn-previous-page">
					<spring:message code="students.table.button.previousPage" />
				</button>
				<span id="current-page-number">${currentPageNumber}</span> <span>
					<spring:message code="students.table.label.of" />&nbsp;${pagesCount}
				</span>
				<button class="btn btn-primary btn-next-page">
					<spring:message code="students.table.button.nextPage" />
				</button>
			</div>
		</div>
		<div class="row">
			<div class="col-md">
				<table class="table table-striped table-bordered table-content">
					<tr>
						<th><spring:message code="students.table.header.id" /></th>

						<th><spring:message code="students.table.header.firstName" />
						</th>

						<th><spring:message code="students.table.header.lastName" />
						</th>

						<th><spring:message code="students.table.header.sex" /></th>

						<th><spring:message code="students.table.header.postalCode" />
						</th>

						<th><spring:message code="students.table.header.emailSddress" />
						</th>

						<th><spring:message code="students.table.header.action" /></th>
					</tr>

					<c:forEach items="${studentsList}" var="student">
						<tr>
							<td>${student.id}</td>
							<td>${student.personalData.firstName}</td>
							<td>${student.personalData.lastName}</td>
							<td>${student.personalData.sex}</td>
							<td>${student.homeLocality.postalCode}</td>
							<td>${student.contactDetails.emailAddress}</td>
							<td><a href="<c:url value='/student/${student.id}' />">
									<spring:message code="students.table.action.show.details" />
							</a>&nbsp;/&nbsp; <a
								href="<c:url value='/students-admin-delete/${student.id}' />">
									<spring:message code="students.table.action.admin.delete" />
							</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<div class="row" id="add-student-operation">
			<div class="col-md6">
				<form action="students-admin-add-student">
					<button type="submit" class="btn btn-success">
						<spring:message code="students.table.admin.add.student" />
					</button>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-md6 text-right">
				<form:form modelAttribute="myFile" class="form-horizontal"
					enctype="multipart/form-data">
					<label class="col-lg-2" for="file"> <spring:message
							code="students.admin.add.students.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="file" type="file" path="data"
							class="form:input-large" />
					</div>
					<div class="col-lg-2" style="margin-left: 25px; margin-top: 0px;">
						<input type="submit" class="btn" value="Submit" />
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>