<%--
 * index.jsp
 *
 * Copyright (C) 2013 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 --%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl"	uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>
<link rel="stylesheet" href="styles/jquery.emojiarea.css">
<!-- <link rel="stylesheet" href="stylesheet.css"> -->
<script src="scripts/jquery.emojiarea.js"></script>
<script src="scripts/packs/basic/emojis.js"></script>
 <link rel="stylesheet" href="https://cdn.rawgit.com/twbs/bootstrap/v4-dev/dist/css/bootstrap.css">

<p><spring:message code="welcome.greeting.prefix" /> ${name}<spring:message code="welcome.greeting.suffix" /></p>
						
						
						<p><button type="button" class="btn btn-success" onClick=" window.location.href='resultados/encuestas.do' ">Encuestas</button></p>
						
					
	
	
				

	
<p><spring:message code="welcome.greeting.current.time" /> ${moment}</p>
