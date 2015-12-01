<%--
 * layout.jsp
 *
 * Copyright (C) 2013 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 --%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<base
	href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <script type="text/javascript" src="scripts/jquery.js"></script> -->
<!-- <script type="text/javascript" src="scripts/jquery-ui.js"></script> -->
<!-- <script type="text/javascript" src="scripts/jmenu.js"></script> -->

<%--EGC --%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<link rel="stylesheet" href="styles/css/estadistica.css">
<link rel="stylesheet" href="styles/css/dropdown.css">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script type="text/javascript" src="scripts/angular.min.js"></script>

<link rel="shortcut icon" href="favicon.ico" />


<link rel="stylesheet" href="styles/common.css" type="text/css">
<!-- <link rel="stylesheet" href="styles/jmenu.css" media="screen" -->
<!-- 	type="text/css" /> -->
<!-- <link rel="stylesheet" href="styles/displaytag.css" type="text/css"> -->

<title><tiles:insertAttribute name="title" ignore="true" /></title>

<script type="text/javascript">
	$(document).ready(function() {
		$("#jMenu").jMenu();
	});

	function askSubmission(msg, form) {
		if (confirm(msg))
			form.submit();
	}
</script>

</head>

<body>

	<!-- Barra principal -->
	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Visualización</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="#">Page 1</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<div class="container-fluid text-center"
		style="background-color: #337AB7; /* Green */ color: #ffffff;">
		<img src="images/img/agora_house.png" class="img-circle" alt="">
		<h3><spring:message code="master.page.layout.title.1" /></h3>
		<h1><spring:message code="master.page.layout.title.2" /></h1>
		<p><spring:message code="master.page.layout.text" /></p>
	</div>







	<div>
		<tiles:insertAttribute name="header" />
	</div>
	<div>
		<h1>
			<tiles:insertAttribute name="title" />
		</h1>
		<tiles:insertAttribute name="body" />
		<jstl:if test="${message != null}">
			<br />
			<span class="message"><spring:message code="${message}" /></span>
		</jstl:if>
	</div>
	<div>
		<tiles:insertAttribute name="footer" />
	</div>

</body>
</html>